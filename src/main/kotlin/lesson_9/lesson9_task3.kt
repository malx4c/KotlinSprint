package lesson_9

fun main() {
    val numberIngredients = listOf(2, 50, 15)
    print("Количество порций:")
    val numberPortion = readln().toInt()

    var message = "На $numberPortion порций вам понадобится: Яиц: ${numberIngredients[0] * numberPortion}, "
    message += "молока: ${numberIngredients[1] * numberPortion}, "
    message += "сливочного масла: ${numberIngredients[2] * numberPortion}"

    print(message)
}

