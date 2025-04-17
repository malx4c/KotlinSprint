package lesson_16

fun main() {
    Dice().getNumber()
}

class Dice {
    private val number: Int = (1..6).random()

    fun getNumber() {
        println(number)
    }
}
