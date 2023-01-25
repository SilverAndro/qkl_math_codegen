import data.MathType
import files.MathTypeFile
import java.io.OutputStream

fun generateMath(output: OutputStream, type: MathType) {
    MathTypeFile(type) {
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
                kdoc { "Divides a [$type] and a [$type]." }
                name = "div"
                isOperator = true
                returnType = type
                param("other", type)
                body { generateOp(type, '/') }
            }

            method {
                kdoc { "Negates a [$type]." }
                name = "unaryMinus"
                isOperator = true
                returnType = type
                body { generateNegate(type) }
            }
        }

        if (types.any { canOperateWith(type, it) }) {
            section("Type compatibility operator variations") {
                types.filter { canOperateWith(type, it) }.forEach {
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

                    method {
                        kdoc { "Divides a [${it.path}] and a [${type.path}]." }
                        name = "div"
                        isOperator = true
                        returnType = type
                        param("other", type)
                        body { generateOp(type, '/') }
                    }
                }
            }
        }

        section("Vector specific operators") {
            repeat(type.components.count) {
                method {
                    kdoc { "The [`${component(it)}`][$type.${component(it)}] of a [$type]." }
                    name = "component${it+1}"
                    isOperator = true
                    returnType = type.backingType.display
                    body { "return this.${component(it)}" }
                }
            }
        }
    }.write(output)
}

fun generateOpLine(param: Char, operation: Char, hasComma: Boolean) =
    "this.$param $operation other.$param" + if (hasComma) "," else ""

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