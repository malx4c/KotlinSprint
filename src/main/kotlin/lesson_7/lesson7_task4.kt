package lesson_7

fun main() {

    print("Введите время (сек): ")
    val time = readln().toInt()

    for (i in time downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}

