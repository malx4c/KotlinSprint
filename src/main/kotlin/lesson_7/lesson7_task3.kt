package lesson_7

fun main() {
    print("Введите число: ")
    val rangeLimit = readln().toInt()
    val range = 0 .. rangeLimit step 1

    for (number in range step 2) {
        println(number)
    }
}

