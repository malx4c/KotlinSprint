package lesson_18

fun main() {
    val dices =
        listOf(
            Dice4(),
            Dice6(),
            Dice8(),
        )
    dices.forEach { it.rollTheDice() }
}

abstract class Dice {
    abstract fun rollTheDice()

    fun printResult(number: Int) {
        print(this.javaClass.simpleName + ": выпало $number\n")
    }
}

class Dice4 : Dice() {
    override fun rollTheDice() {
        printResult((1..4).random())
    }
}

class Dice6 : Dice() {
    override fun rollTheDice() {
        printResult((1..4).random())
    }
}

class Dice8 : Dice() {
    override fun rollTheDice() {
        printResult((1..4).random())
    }
}
