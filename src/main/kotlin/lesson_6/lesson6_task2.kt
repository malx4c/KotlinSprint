package lesson_6

fun main () {
    print("Введиет время таймера (сек):")
    val time = readln().toLong()
    Thread.sleep(time * MILLS_IN_SECOND)
    println("Прошло $time секунд:")
}

const val MILLS_IN_SECOND = 1000