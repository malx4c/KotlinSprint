package lesson_22.task2

fun main() {
    val regularBook = RegularBook("Книга", "Автор")
    val dataBook = DataBook("Книга", "Автор")

    // вывод содержит имя родительского класса и его хэшкод
    println(regularBook)

    // вывод содержит имя родительского класса и данные его полей
    println(dataBook)
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
