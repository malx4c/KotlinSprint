package lesson_6

fun main () {
    val number = (NUMBER_MIN..NUMBER_MAX).random()
    var isWin = false

    for (attempt in 1..NUMBER_OF_ATTEMPTS) {
       print("$number Введите число: ")
       if (number != readln().toInt()) {
           println("Неверно! Осталось попыток: ${NUMBER_OF_ATTEMPTS - attempt}")
           continue
       } else {
           isWin = true
           break
       }
    }

    if (!isWin)
        println("Было загадано число $number")
    else
        println("Это была великолепная игра!")
}

const val NUMBER_MIN = 1
const val NUMBER_MAX = 9
const val NUMBER_OF_ATTEMPTS = 5
