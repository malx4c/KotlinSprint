package lesson_7

fun main() {

    print("Введите время (сек): ")
    for (i in readln().toInt() downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}

