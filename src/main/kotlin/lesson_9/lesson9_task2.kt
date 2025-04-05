package lesson_9

fun main() {
    val ingredients = mutableListOf ("соль", "перец", "мясо")
    println("В рецепте есть базовые ингредиенты::")
    ingredients.forEach { println(it) }

    print("Желаете добавить еще?")
    if (!readln().equals(YES_WORD ,true)) return

    print("Какой ингредиент вы хотите добавить?")
    ingredients.add(readln())

    println("Теперь в рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
}

const val YES_WORD = "да"
