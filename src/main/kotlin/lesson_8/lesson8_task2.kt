package lesson_8
fun main() {
    val ingredients = arrayOf("соль", "перец", "мясо")
    print("Введите ингредиент:")
    val searchText = readln().lowercase()

    for (ingredient in ingredients) {
        if (ingredient == searchText) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}