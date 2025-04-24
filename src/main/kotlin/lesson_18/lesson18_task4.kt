package lesson_18.task4

fun main() {
    val packages: List<Package> =
        listOf(
            CubePackage(10),
            RectanglePackage(20, 10, 5),
        )
    packages.forEach { println("Площадь ${it.javaClass.simpleName}: ${it.getSquare()}") }
}

abstract class Package(
    val length: Int,
) {
    abstract fun getSquare(): Double
}

class CubePackage(
    length: Int,
) : Package(length) {
    override fun getSquare(): Double = 6 * Math.pow(length.toDouble(), 2.0)
}

class RectanglePackage(
    length: Int,
    val width: Int,
    val height: Int,
) : Package(length) {
    override fun getSquare(): Double = 2.0 * (length * width + length * height + width * height)
}
