package files

import data.MathType

class MathTypeMethod {
    lateinit var name: String
    var isOperator = false
    private var comment: String? = null
    private var body: String? = null
    var returnType: MathType? = null

    val params = mutableListOf<Param>()

    fun param(name: String, type: MathType) {
        params.add(Param(name, type.toString()))
    }

    fun kdoc(action: ()->String) {
        comment = action()
    }

    fun body(action: () -> String) {
        body = action()
    }

    data class Param(val name: String, val type: String)

    /**
     *
     */
    fun write(baseType: String): String {
        val totalComment = if (comment == null) "" else """
            /**
            ${comment!!.split("\n").map { " * $it" }.joinToString(separator = "\n", prefix = "", postfix = "")}
             */${'\n'}
        """.trimIndent()

        val declaration =
            "public ${if (isOperator) "operator " else ""}fun $baseType.$name(${params.joinToString(separator = ", ") { "${it.name}: ${it.type}" }})${if (returnType != null) ": $returnType" else ""} {\n"
        val methodBody = (body?.split("\n")?.joinToString("\n", "", "") { "    $it" } ?: "    ") + "\n"

        return "$totalComment$declaration$methodBody}\n"
    }
}