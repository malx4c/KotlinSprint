package lesson_18

fun main() {
    val screen = Screen()
    screen.draw(10, 20)
    screen.draw(100f, 200f)
    screen.draw(400, 300f)
}

class Screen {
    fun draw(
        x: Int,
        y: Int,
    ) {
        println("Нарисован круг в ($x, $y)")
    }

    fun draw(
        x: Float,
        y: Float,
    ) {
        println("Нарисован квадрат в ($x, $y)")
    }

    fun draw(
        x: Int,
        y: Float,
    ) {
        println("Нарисована точка в ($x, $y)")
    }
}
