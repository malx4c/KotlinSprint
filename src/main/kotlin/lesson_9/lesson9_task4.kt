package lesson_9

fun main() {
    print("Введите названия пяти ингредиентов, разделенных запятой с пробелом:")
    val ingredients =  readln().split(", ")

    if (ingredients.size != MIN_NUMBER_INGREDIENTS ) {
        println("Ошибка ввода")
    }

    val sortedIngredients = ingredients.sorted()
    sortedIngredients.forEach { println (it) }
}
const val MIN_NUMBER_INGREDIENTS = 5
