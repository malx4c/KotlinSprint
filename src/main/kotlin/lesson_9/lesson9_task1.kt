package lesson_9

fun main() {
    val ingredients = listOf("соль", "перец", "мясо")
    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
}