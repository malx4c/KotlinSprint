package lesson_7

fun main() {
    print("Введите число: ")
    val rangeLimit = readln().toInt()
    val range = 0 .. rangeLimit step 1

    for (number in range) {
        if (number % 2 == 0) println(number)
    }
}

