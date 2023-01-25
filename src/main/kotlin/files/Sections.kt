package files

class StartSection(val sectionName: String) : MathTypeSection {
    override fun write(baseType: String): String {
        return "//region $sectionName"
    }
}

class EndSection() : MathTypeSection {
    override fun write(baseType: String): String {
        return "//endregion\n"
    }
}