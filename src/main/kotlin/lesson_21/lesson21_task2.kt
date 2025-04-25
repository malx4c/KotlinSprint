package lesson_21

fun main() {
    val numbers: List<Int> = listOf(1, 2, 8, 3, 1, 10)

    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int = this.sumOf { if (it % 2 == 0) it else 0 }
