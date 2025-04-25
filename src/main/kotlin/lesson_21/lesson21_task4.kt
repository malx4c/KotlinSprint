package lesson_21

import java.io.File

fun main() {
    val dictionaryFile = "dictionary.txt"

    if (!File(dictionaryFile).exists()) File(dictionaryFile).writeText("")

    for (i in 1..10) {
        File(dictionaryFile).appendTextToTheBeginning("Строка$i")
    }

    println(File(dictionaryFile).readText())
}

fun File.appendTextToTheBeginning(text: String) {
    writeText("${text.lowercase()}\n${readText()}")
}
