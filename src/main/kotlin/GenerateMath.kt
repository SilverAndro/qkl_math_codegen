import data.MathType
import files.MathTypeFile
import java.io.OutputStream

fun generateMath(output: OutputStream, type: MathType) {
    MathTypeFile(type) {
        val compatibleTypes = types.filter { canOperateWith(type, it) }
        val similarTypes = compatibleTypes + type

        compatibleTypes.forEach {
            if (it.hasUniqueName(similarTypes)) {
                import(it)
            }
        }

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
                    method {
                        kdoc { "Adds a [${it.workingName(similarTypes, true)}] to a [${type}]." }
                        name = "plus"
                        isOperator = true
                        returnType = type
                        param("other", it.workingName(similarTypes, true))
                        body { generateOp(type, '+') }
                    }

                    method {
                        kdoc { "Subtracts a [${it.workingName(similarTypes, true)}] from a [${type}]." }
                        name = "minus"
                        isOperator = true
                        returnType = type
                        param("other", it.workingName(similarTypes, true))
                        body { generateOp(type, '-') }
                    }

                    method {
                        kdoc { "Multiplies a [${it.workingName(similarTypes, true)}] and a [${type}].\nThis method is a shorthand for component wise multiplication." }
                        name = "times"
                        isOperator = true
                        returnType = type
                        param("other", it.workingName(similarTypes, true))
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

            similarTypes.forEach {
                method {
                    kdoc { "Returns the dot product of a [$type] and a [${it.workingName(similarTypes, true, type)}]" }
                    name = "dot"
                    isInfix = true
                    returnType = type.backingType.display
                    param("other", it.workingName(similarTypes, true, type))
                    body {
                        buildString {
                            append("return ")
                            repeat(type.components.count) {
                                append("(this.${component(it)} * other.${component(it)})")
                                if (it != type.components.count-1) {
                                    append(" + ")
                                }
                            }
                        }
                    }
                }
            }

            if (type.components == MathType.Components.XYZ) {
                similarTypes.forEach {
                    method {
                        kdoc { "Returns the cross product of a [$type] and a [${it.workingName(similarTypes, true)}]" }
                        name = "cross"
                        isInfix = true
                        returnType = type
                        param("other", it.workingName(similarTypes, true))
                        body {
                            buildString {
                                appendLine("return $type(")
                                appendLine("    (this.${component(1)} * other.${component(2)}) - (this.${component(2)} * other.${component(1)}),")
                                appendLine("    (this.${component(2)} * other.${component(0)}) - (this.${component(0)} * other.${component(2)}),")
                                appendLine("    (this.${component(0)} * other.${component(1)}) - (this.${component(1)} * other.${component(0)}),")
                                append(")")
                            }
                        }
                    }
                }
            }
        }

        if (compatibleTypes.isNotEmpty()) {
            section("Conversion methods") {
                compatibleTypes.forEach { otherType ->
                    method {
                        kdoc { "Converts a [$type] to a [${otherType.workingName(similarTypes, true)}]." }
                        name = "to${otherType.workingName(similarTypes)}"
                        returnType = otherType.workingName(similarTypes, true)
                        body {
                            buildString {
                                appendLine("return ${otherType.workingName(similarTypes, true)}(")
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