package lesson_15

fun main() {
    val guitars = Instrument("Гитара", 3)
    guitars.runSearch("струны")
}

abstract class Good(
    val name: String,
    val countOfStock: Int,
)

class Instrument(
    name: String,
    countOfStock: Int,
) : Good(name, countOfStock),
    Search {
    val components: List<Component> = listOf()
}

class Component(
    name: String,
    countOfStock: Int,
) : Good(name, countOfStock)

interface Search {
    fun runSearch(searchText: String) {
        println("Выполняется поиск <$searchText>")
    }
}
