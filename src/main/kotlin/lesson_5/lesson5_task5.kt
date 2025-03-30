package lesson_5

fun main() {
    val numberList: MutableList<Int> = mutableListOf()
    val answerList: MutableList<Int> = mutableListOf()

    for (index in 0..NUMBER_COUNT - 1 ) {
        numberList.add((Math.random() * MAX_NUMBER).toInt())
    }

    for (index in 0..NUMBER_COUNT - 1) {
        println("Введите число номер ${index+1}: ")
        answerList.add(readln().toInt())
    }

    val result = numberList.intersect(answerList).size

    when (result) {
        3   -> println("Вы угадали все числа и выиграли джекпот")
        2   -> println("Вы угадали два числа и получаете крупный приз")
        1   -> println("Вы угадали одно число и получаете утешительный приз")
        else    -> println("Вы не угадали ни одного числа")
    }

    println("Были загаданны числа:")
    numberList.forEach() {
        println(it)
    }
}

const val NUMBER_COUNT = 3
const val MAX_NUMBER = 42




