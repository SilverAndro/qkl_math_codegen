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
    types.forEach {
        output(it.uniqueName) {

        }
    }
}

fun output(name: String, action: (OutputStream)->Unit) {
    with(dir.resolve("${name}\$Math.kt").createFile().outputStream()) {
        action(this)
    }
}