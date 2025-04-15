package lesson_15

fun main() {
    val guitars = Instrument("Гитара", 3)
    guitars.runSearch("струны")
}

abstract class Good {
    abstract val name: String
    abstract val countOfStock: Int
}

class Instrument(
    override val name: String,
    override val countOfStock: Int,
) : Good(),
    Search {
    val components: List<Component> = listOf()
}

class Component(
    override val name: String,
    override val countOfStock: Int,
) : Good()

interface Search {
    fun runSearch(searchText: String) {
        println("Выполняется поиск <$searchText>")
    }
}
