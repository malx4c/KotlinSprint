package lesson_5

fun main() {
    val numberOne = 1
    val numberTwo = 2

    println("Введите два целых числа от $RANGE_MIN до $RANGE_MAX, разделенные пробелом")
    val answer = readln().split(" ")

    val answerOne = answer[0].toInt()
    val answerTwo = answer[1].toInt()

    if (answerOne == numberOne && answerTwo == numberTwo || answerOne == numberTwo && answerTwo == numberOne)
        println ("Поздравляем! Вы выиграли главный приз!")
    else if (answerOne == numberOne || answerOne == numberTwo  || answerTwo == numberOne || answerTwo == numberTwo)
        println ("Поздравляем! Вы выиграли утешительный приз!")
    else {
        println("Неудача!")
        println("Правильный ответ: $numberOne и $numberTwo")
    }
}

const val RANGE_MIN = 0
const val RANGE_MAX = 42


