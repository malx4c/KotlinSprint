package lesson_14

import kotlin.math.PI

fun main() {
    val figures =
        listOf(
            Circle(COLOR_WHITE, 10),
            Circle(COLOR_BLACK, 15),
            Rectangle(COLOR_WHITE, 100, 20),
            Rectangle(COLOR_BLACK, 80, 40),
        )

    var sumPerimeter = 0.0
    var sumArea = 0.0

    for (figure in figures) {
        when (figure.color) {
            COLOR_BLACK -> sumPerimeter += figure.calculatePerimeter()
            COLOR_WHITE -> sumArea += figure.calculateArea()
        }
    }

    println("Сумма периметров всех черных фигур: $sumPerimeter")
    println("Сумма площадей всех белых фигур: $sumArea")
}

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun calculateArea(): Double = radius * radius * PI

    override fun calculatePerimeter(): Double = 2 * radius * PI
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun calculateArea(): Double = (width * height).toDouble()

    override fun calculatePerimeter(): Double = 2.0 * (width + height)
}

const val COLOR_WHITE = "белый"
const val COLOR_BLACK = "черный"
