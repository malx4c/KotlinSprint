package lesson_18

fun main() {
    val screen = Screen()
    screen.drawCircle(10, 20)
    screen.drawCircle(10f, 20f)

    screen.drawSquare(100, 200)
    screen.drawSquare(100f, 200f)

    screen.drawPoint(400, 300)
    screen.drawPoint(400f, 300f)
}

class Screen {
    fun drawCircle(
        x: Int,
        y: Int,
    ) {
        println("Нарисован круг в ($x, $y)")
    }

    fun drawCircle(
        x: Float,
        y: Float,
    ) {
        println("Нарисован круг в ($x, $y)")
    }

    fun drawSquare(
        x: Int,
        y: Int,
    ) {
        println("Нарисован квадрат в ($x, $y)")
    }

    fun drawSquare(
        x: Float,
        y: Float,
    ) {
        println("Нарисован квадрат в ($x, $y)")
    }

    fun drawPoint(
        x: Int,
        y: Int,
    ) {
        println("Нарисована точка в ($x, $y)")
    }

    fun drawPoint(
        x: Float,
        y: Float,
    ) {
        println("Нарисована точка в ($x, $y)")
    }
}
