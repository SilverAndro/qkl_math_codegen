package files

class MathTypeMethod : MathTypeSection {
    lateinit var name: String
    var isOperator = false
    var isInfix = false
    private var comment: String? = null
    private var body: String? = null
    var returnType: Any? = null
        set(value) {
            field = value?.toString()
        }

    val params = mutableListOf<Param>()

    fun param(name: String, type: Any) {
        params.add(Param(name, type.toString()))
    }

    fun kdoc(action: ()->String) {
        comment = action()
    }

    fun body(action: () -> String) {
        body = action()
    }

    data class Param(val name: String, val type: String)

    override fun write(baseType: String): String {
        val totalComment = if (comment == null) "" else "/**\n${comment!!.split("\n").map { " * $it" }.joinToString(separator = "\n", prefix = "", postfix = "")}\n */\n"

        val declaration =
            "public ${if (isInfix) "infix " else ""}${if (isOperator) "operator " else ""}fun $baseType.$name(${params.joinToString(separator = ", ") { "${it.name}: ${it.type}" }})${if (returnType != null) ": $returnType" else ""} {\n"
        val methodBody = (body?.split("\n")?.joinToString("\n", "", "") { "    $it" } ?: "    ") + "\n"

        return "$totalComment$declaration$methodBody}\n"
    }
}