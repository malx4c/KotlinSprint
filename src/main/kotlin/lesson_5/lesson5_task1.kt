package lesson_5

fun main() {
    val additiveNumber1: Int = (Math.random() * 10).toInt()
    val additiveNumber2: Int = (Math.random() * 10).toInt()
    val answer = readlnOrNull()?.toInt()

    print("Сколько будет $additiveNumber1 + $additiveNumber2 = ")

    if (answer == additiveNumber1 + additiveNumber2)
        println ("Добро пожаловать!")
    else
        println ("Доступ запрещен.")
}