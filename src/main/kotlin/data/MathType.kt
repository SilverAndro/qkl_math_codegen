package data

data class MathType(val path: String, val components: Components, val backingType: BackingType, val fallbackPrefix: String) {
    val name = path.split(".").last()
    val uniqueName = fallbackPrefix + name
    override fun toString() = name

    fun hasUniqueName(typeSet: List<MathType>): Boolean {
        return typeSet.any { it != this && it.toString() == this.toString() }.not()
    }

    fun workingName(typeSet: List<MathType>, pathInstead: Boolean = false): String = if (hasUniqueName(typeSet)) name else if (pathInstead) path else uniqueName

    enum class Components(val count: Int) {
        XY(2),
        XYZ(3),
        XYZW(4)
    }

    enum class BackingType(val display: String, val prefix: String) {
        INT("Int", "an"),
        FLOAT("Float", "a"),
        DOUBLE("Double", "a")
    }
}
