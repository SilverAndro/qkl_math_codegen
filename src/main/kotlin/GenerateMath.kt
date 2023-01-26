import data.MathType
import files.MathTypeFile
import java.io.OutputStream

fun generateMath(output: OutputStream, type: MathType) {
    MathTypeFile(type) {
        val compatibleTypes = types.filter { canOperateWith(type, it) }
        section("Standard math operators") {
            method {
                kdoc { "Adds a [$type] to a [$type]." }
                name = "plus"
                isOperator = true
                returnType = type
                param("other", type)
                body { generateOp(type, '+') }
            }

            method {
                kdoc { "Subtracts a [$type] from a [$type]." }
                name = "minus"
                isOperator = true
                returnType = type
                param("other", type)
                body { generateOp(type, '-') }
            }

            method {
                kdoc { "Multiplies a [$type] and a [$type].\nThis method is a shorthand for component wise multiplication." }
                name = "times"
                isOperator = true
                returnType = type
                param("other", type)
                body { generateOp(type, '*') }
            }

            method {
                kdoc { "Negates a [$type]." }
                name = "unaryMinus"
                isOperator = true
                returnType = type
                body { generateNegate(type) }
            }
        }

        if (compatibleTypes.isNotEmpty()) {
            section("Type compatibility operator variations") {
                compatibleTypes.forEach {
                    import(it)
                    method {
                        kdoc { "Adds a [${it.path}] to a [${type.path}]." }
                        name = "plus"
                        isOperator = true
                        returnType = type
                        param("other", it)
                        body { generateOp(type, '+') }
                    }

                    method {
                        kdoc { "Subtracts a [${it.path}] from a [${type.path}]." }
                        name = "minus"
                        isOperator = true
                        returnType = type
                        param("other", type)
                        body { generateOp(type, '-') }
                    }

                    method {
                        kdoc { "Multiplies a [${it.path}] and a [${type.path}].\nThis method is a shorthand for component wise multiplication." }
                        name = "times"
                        isOperator = true
                        returnType = type
                        param("other", type)
                        body { generateOp(type, '*') }
                    }
                }
            }
        }

        section("Vector specific operators") {
            method {
                kdoc { "Divides a [$type] and ${type.backingType.prefix} ${type.backingType.display}." }
                name = "div"
                isOperator = true
                returnType = type
                param("other", type.backingType.display)
                body { generateBackingDivision(type) }
            }

            repeat(type.components.count) {
                method {
                    kdoc { "The [`${component(it)}`][$type.${component(it)}] of a [$type]." }
                    name = "component${it+1}"
                    isOperator = true
                    returnType = type.backingType.display
                    body { "return this.${component(it)}" }
                }
            }

            (compatibleTypes + listOf(type)).forEach {
                method {
                    kdoc { "Returns the dot product of a [$type] and a [${it.path}]" }
                    name = "dot"
                    returnType = type.backingType.display
                }
            }
        }

        if (compatibleTypes.isNotEmpty()) {
            section("Conversion methods") {
                compatibleTypes.forEach { otherType ->
                    method {
                        kdoc { "Converts a [$type] to a [${otherType.path}]." }
                        name = if (otherType.hasUniqueName(compatibleTypes)) "to$otherType" else "to${otherType.uniqueName}"
                        returnType = otherType.path
                        body {
                            buildString {
                                appendLine("return $otherType(")
                                repeat(otherType.components.count) {
                                    appendLine("    " + generateAccessLine(component(it), it != otherType.components.count - 1))
                                }
                                append(")")
                            }
                        }
                    }
                }
            }
        }
    }.write(output)
}

fun generateOpLine(param: Char, operation: Char, hasComma: Boolean) =
    "this.$param $operation other.$param" + if (hasComma) "," else ""

fun generateAccessLine(param: Char, hasComma: Boolean) =
    "this.$param" + if (hasComma) "," else ""

fun generateOp(type: MathType, operation: Char): String {
    return buildString {
        appendLine("return $type(")
        repeat(type.components.count) {
            appendLine(
                "    " + generateOpLine(
                    component(it),
                    operation,
                    it != type.components.count - 1
                )
            )
        }
        append(")")
    }
}

fun generateBackingDivision(type: MathType): String {
    return buildString {
        appendLine("return $type(")
        repeat(type.components.count) {
            appendLine(
                "    this.${component(it)} / other" + if (it != type.components.count - 1) "," else ""
            )
        }
        append(")")
    }
}

fun generateNegate(type: MathType): String {
    return buildString {
        appendLine("return $type(")
        repeat(type.components.count) {
            appendLine(
                "    -this.${component(it)}" + if (it != type.components.count - 1) "," else ""
            )
        }
        append(")")
    }
}