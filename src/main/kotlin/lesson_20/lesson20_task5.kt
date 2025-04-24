package lesson_20

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}

class Robot {
    private var modifier: (String) -> String = { it }
    private val phrases =
        listOf(
            "Привет",
            "Пока",
            "Забористая батарейка",
            "Еще парочку",
            "Я работаю, думать не мое",
        )

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}
