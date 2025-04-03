package lesson_8

fun main() {
    print("Введите количество ингредиентов:")
    val numberIngredients = readln().toInt()
    var result = ""
    println("Введите ингредиенты:")
    for ( i in 0..numberIngredients - 1) {
        result += readln() + ","
    }
    print(result.dropLast(1))
}