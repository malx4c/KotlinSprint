package lesson_22.task3

fun main() {
    val book = DataBook("Книга", "Автор", "Аннотация")
    val (nameBook, authorBook, annotationBook) = book

    println("$nameBook, $authorBook, $annotationBook")
}

data class DataBook(
    val name: String,
    val author: String,
    val annotation: String,
)
