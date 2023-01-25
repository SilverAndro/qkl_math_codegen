package data

data class MathType(val path: String, val components: Components, val backingType: BackingType, val isMutable: Boolean) {
    val name = path.split(".").last()
    val uniqueName = path.split(".").dropLast(1).map { it.first().uppercase() }.joinToString(separator = "", prefix = "", postfix = "$") + name
    override fun toString() = name
    enum class Components {
        XY,
        XYZ,
        XYZW
    }

    enum class BackingType {
        INT,
        FLOAT,
        DOUBLE
    }
}
