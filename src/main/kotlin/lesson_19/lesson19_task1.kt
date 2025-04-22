package lesson_19

fun main() {
    println("Список рыб:")
    for (fish in Fish.entries) println(fish.nameFish)
}

enum class Fish(
    val nameFish: String,
) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}
