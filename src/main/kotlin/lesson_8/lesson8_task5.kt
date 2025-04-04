package lesson_8

fun main() {
    print("Введите количество ингредиентов:")
    val numberIngredients = readln().toInt()
    val ingredients = arrayOfNulls<String>(numberIngredients)
    var result = ""

    println("Введите ингредиенты:")
    for ( i in 0 until numberIngredients) {
        ingredients[i] = readln()
    }
    ingredients.forEach  {result  += "$it,"}
    println(result.dropLast(1))
}
