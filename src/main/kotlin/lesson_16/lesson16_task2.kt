package lesson_16

fun main() {
    val circle = Circle(10.0)
    println("Площадь: ${circle.getSquare()}")
    println("Длина: ${circle.getLength()}")
}

class Circle(
    private val radius: Double,
) {
    fun getSquare(): Double = PI * Math.pow(radius, 2.0)

    fun getLength(): Double = 2 * PI * radius
}

private const val PI = 3.14f
