package lesson_22

fun main() {
    val regularBook1 = RegularBook("Книга", "Автор")
    val regularBook2 = RegularBook("Книга", "Автор")

    val dataBook1 = DataBook("Книга", "Автор")
    val dataBook2 = DataBook("Книга", "Автор")

    // false , т.к. сравниваются объекты, а они разные, хотя их поля содержат одинаковые данные
    println(regularBook1 == regularBook2)

    // true , т.к. сравниваются даныне в полях
    println(dataBook1 == dataBook2)
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
