package lesson_5

fun main() {
    val number1 = (0..10).random()
    val number2 =  (0..10).random()

    print("Сколько будет $number1 + $number2 = ")
    val answer = readlnOrNull()?.toInt()

    if (answer == number1 + number2)
        println ("Добро пожаловать!")
    else
        println ("Доступ запрещен.")
}