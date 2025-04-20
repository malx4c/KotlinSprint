package lesson_17

fun main() {
    val folder1 = Folder("Документы", 10)
    val folder2 = Folder("Секреты", 100, true)

    println(folder1.name)
    println(folder2.name)
}

class Folder(
    private val _name: String,
    val countFiles: Int = 0,
    val isHidden: Boolean = false,
) {
    var name: String = _name
        get() {
            val prompt = if (isHidden) "Скрытая папка, файлов: 0" else "<$field>, файлов: $countFiles"
            return prompt
        }
}
