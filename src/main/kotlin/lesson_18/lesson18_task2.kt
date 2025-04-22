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

abstract class Dice(
    val numberOfFaces: Int,
) {
    fun rollTheDice() {
        print(this.javaClass.simpleName + ": выпало ${(1..numberOfFaces).random()}\n")
    }
}

class Dice4 : Dice(4)

class Dice6 : Dice(6)

class Dice8 : Dice(8)
