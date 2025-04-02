package lesson_7

fun main() {
    while (true) {
        var sms = ""
        sms += (1000..9999).random().toString()
        print("Ваш код авторизации: $sms\nВведите код:")
        if (readln() == sms) break
    }
    println("Добро пожаловать!")
}

