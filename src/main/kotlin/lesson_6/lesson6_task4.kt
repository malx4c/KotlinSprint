package lesson_6

fun main () {
    val numberOfAttempts = 5
    val number = (NUMBER_MIN..NUMBER_MAX).random()
    var isWin = false

    for (attempt in 1..numberOfAttempts) {
       print("$number Введите число: ")
       if (number != readln().toInt()) {
           println("Неверно! Осталось попыток: ${numberOfAttempts - attempt}")
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

