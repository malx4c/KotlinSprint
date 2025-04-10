package lesson_9

fun main() {
    var result = ""
    println("Введите ингредиенты:")
    val ingredients: MutableSet<String> =  mutableSetOf()

    for ( i in 1..MIN_NUM_INGREDIENTS) {
        ingredients.add(readln())
    }

    val sortedIngredients = ingredients.sorted()

    for (ingredient in sortedIngredients) {
        result += "$ingredient,"
    }

    print(result.dropLast(1).replaceFirstChar { it.uppercase() })
}

const val MIN_NUM_INGREDIENTS = 5