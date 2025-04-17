package lesson_16

fun main() {
    val circle = Circle(10f)
    println("Площадь: ${circle.getSquare()}")
    println("Длина: ${circle.getLength()}")
}

class Circle(
    private val radius: Float,
) {
    fun getSquare(): Float = PI * radius * radius

    fun getLength(): Float = 2 * PI * radius
}

private const val PI = 3.14f
