package lesson_6

fun main () {
    var isAuth = false
    val range = 1..9

    for (attempt in 1..NUMBER_OF_ATTEMPTS) {
        val number1 = range.random()
        val number2 = range.random()

        print("Сколько будет $number1 + $number2 = ")
        val answer = readlnOrNull()?.toInt()

        if (answer != number1 + number2) {
            if (attempt != NUMBER_OF_ATTEMPTS) println("Попробуйте еще раз!")
            continue
        } else {
            isAuth = true
            break
        }
    }
        if (isAuth)
            println("Добро пожаловать")
        else
            println("Доступ запрещен")
}

const val NUMBER_OF_ATTEMPTS = 3
