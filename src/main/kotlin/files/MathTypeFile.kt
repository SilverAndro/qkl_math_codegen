package files

import data.MathType
import java.io.OutputStream

class MathTypeFile(val baseType: MathType, action: MathTypeFile.()->Unit) {
    private val imports = mutableListOf<String>()
    private val sections = mutableListOf<MathTypeSection>()

    init {
        import(baseType)
        action()
    }

    fun import(import: MathType) {
        imports.add(import.path)
    }

    fun import(import: Any) {
        imports.add(import.toString())
    }

    fun section(sectionName: String, action: MathTypeFile.() -> Unit) {
        sections.add(StartSection(sectionName))
        action()
        sections.add(EndSection())
    }

    fun method(action: MathTypeMethod.()->Unit) {
        sections.add(MathTypeMethod().apply(action))
    }

    fun write(out: OutputStream) {
        out.write(buildString {
            appendLine("""
                // DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
                
                package org.quiltmc.qkl.library.math
                
            """.trimIndent())

            imports.forEach {
                appendLine("import $it")
            }
            appendLine()
            sections.forEachIndexed { index, section ->
                append(section.write(baseType.name))
                if (index + 1 <= sections.lastIndex && sections[index + 1] !is EndSection) {
                    appendLine()
                }
            }
        }.toByteArray())
    }
}