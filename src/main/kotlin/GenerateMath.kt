import data.MathType
import files.MathTypeFile
import java.io.OutputStream

fun generateMath(output: OutputStream, type: MathType) {
    MathTypeFile(type) {
        method {
            kdoc { "Adds a [$type] to a [$type]." }
            name = "plus"
            isOperator = true
            returnType = type
            param("other", type)
        }

        method {
            kdoc { "Subtracts a [$type] from a [$type]." }
            name = "minus"
            isOperator = true
            returnType = type
            param("other", type)
        }

        method {
            kdoc { "Multiplies a [$type] and a [$type]." }
            name = "times"
            isOperator = true
            returnType = type
            param("other", type)
        }

        method {
            kdoc { "Divides a [$type] and a [$type]." }
            name = "div"
            isOperator = true
            returnType = type
            param("other", type)
        }

        method {
            kdoc { "Negates a [$type]." }
            name = "unaryMinus"
            isOperator = true
            returnType = type
        }
    }.write(output)
}