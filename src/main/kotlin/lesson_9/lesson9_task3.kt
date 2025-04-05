package lesson_9

fun main() {
    val numberIngredients = listOf(2, 50, 15)
    print("Количество порций:")
    val numberPortion = readln().toInt()

    val totalIngredients = numberIngredients.map { it * numberPortion }

    var message = "На $numberPortion порций вам понадобится: Яиц: ${totalIngredients[0]}, "
    message += "молока: ${totalIngredients[1]}, "
    message += "сливочного масла: ${totalIngredients[2]}"

    print(message)
}

