package files

import data.MathType
import java.io.OutputStream

class MathTypeFile(val baseType: MathType, action: MathTypeFile.()->Unit) {
    val imports = mutableListOf<MathType>()
    val methods = mutableListOf<MathTypeMethod>()

    init {
        import(baseType)
        action()
    }

    fun import(import: MathType) {
        imports.add(import)
    }

    fun method(action: MathTypeMethod.()->Unit) {
        methods.add(MathTypeMethod().apply(action))
    }

    fun write(out: OutputStream) {
        out.write(buildString {
            imports.forEach {
                appendLine("import ${it.path}")
            }
            appendLine()
            methods.forEach {
                append(it.write(baseType.name))
                appendLine()
            }
        }.toByteArray())
    }
}