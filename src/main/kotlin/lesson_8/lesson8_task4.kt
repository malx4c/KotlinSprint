package lesson_8
fun main() {
    val ingredients = arrayOf("соль", "перец", "мясо","рыба")
    ingredients.forEach { println (it) }

    print("Введите ингредиент:")
    val searchText = readln().lowercase()
    val index = ingredients.indexOf(searchText)
    if (index != -1) {
        print("Введите новый ингредиент:")
        ingredients[index] = readln()
        println("Готово! Вы сохранили следующий список:")
        ingredients.forEach { println (it) }
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}