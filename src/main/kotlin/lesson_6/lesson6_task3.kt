package lesson_6

fun main () {
    print("Введиет время таймера (сек):")
    var time = readln().toLong()

    while (time != 0L ) {
        println("осталось cекунд $time:")
        Thread.sleep(1000)
        time--
    }
    println ("Время вышло")
}

