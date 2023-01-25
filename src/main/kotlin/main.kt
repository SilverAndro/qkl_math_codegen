import java.io.OutputStream
import kotlin.io.path.Path
import kotlin.io.path.createDirectory
import kotlin.io.path.createFile
import kotlin.io.path.outputStream

val dir = Path("output").apply {
    toFile().deleteRecursively()
    createDirectory()
}
fun main() {
    types.forEach { type ->
        output(type.uniqueName) {output ->
            generateMath(output, type)
        }
    }
}

fun output(name: String, action: (OutputStream)->Unit) {
    val file = dir.resolve("${name}\$Ops.kt").createFile()
    with(file.outputStream()) {
        action(this)
    }
}