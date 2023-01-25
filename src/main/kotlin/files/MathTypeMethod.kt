package files

class MathTypeMethod {
    lateinit var name: String
    var isOperator = false
    private var comment: String? = null
    private var body: String? = null
    var returnType = ""

    val params = mutableListOf<Param>()

    fun param(name: String, type: String) {
        params.add(Param(name, type))
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
            "${if (isOperator) "operator " else ""}fun $baseType.$name(${params.joinToString(separator = ", ") { "${it.name}: ${it.type}" }})${if (returnType.isEmpty()) "" else ": $returnType"} {\n"
        val methodBody = (body?.split("\n")?.joinToString("\n", "", "") { "    $it" } ?: "    ") + "\n"

        return "$totalComment$declaration$methodBody}\n"
    }
}