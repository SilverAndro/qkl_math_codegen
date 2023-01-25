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
                kdoc { "Multiplies a [$type] and a [$type]." }
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
    }.write(output)
}

fun generateOpLine(param: Char, operation: Char, hasComma: Boolean) = "this.$param $operation other.$param" + if (hasComma) "," else ""

fun generateOp(type: MathType, operation: Char): String {
    return buildString {
        appendLine("return $type(")
        repeat(type.components.count) {
            appendLine("    " + generateOpLine(arrayOf('x', 'y', 'z', 'w')[it], operation, it != type.components.count - 1))
        }
        append(")")
    }
}

fun generateNegate(type: MathType): String {
    return buildString {
        appendLine("return $type(")
        repeat(type.components.count) {
            appendLine("    -this.${arrayOf('x', 'y', 'z', 'w')[it]}" + if (it != type.components.count - 1) "," else "")
        }
        append(")")
    }
}