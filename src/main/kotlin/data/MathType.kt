package data

data class MathType(val path: String, val components: Components, val backingType: BackingType) {
    val name = path.split(".").last()
    val uniqueName = path.split(".").dropLast(1).map { it.first().uppercase() }.joinToString(separator = "", prefix = "", postfix = "$") + name
    override fun toString() = name
    enum class Components(val count: Int) {
        XY(2),
        XYZ(3),
        XYZW(4)
    }

    enum class BackingType(val display: String) {
        INT("Int"),
        FLOAT("Float"),
        DOUBLE("Double")
    }
}
