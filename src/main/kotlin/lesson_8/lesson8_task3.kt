package lesson_8
fun main() {
    val ingredients = arrayOf("соль", "перец", "мясо")
    print("Введите ингредиент:")
    val searchText = readln().lowercase()

    val result = if (ingredients.contains(searchText)) "Ингредиент $searchText в рецепте есть"
                  else "Такого ингредиента в рецепте нет"

    println(result)
}