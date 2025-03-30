package lesson_5

fun main() {
    println("Введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа")
    val user = readln()
    if (user == AUTH_USER_NAME) {
        println("Введи, пожалуйста, свой пароль")
        val pass = readln()

        if (pass == AUTH_USER_PASS)
            println("Пользователь $AUTH_USER_NAME, вам разрешено входить на борт корабля")
        else
            println("$AUTH_USER_NAME, не правильный пароль")
    } else
        println("Вам надо пройти процедуру регистрации")
}

const val AUTH_USER_NAME = "Zaphod"
const val AUTH_USER_PASS = "PanGalactic"



