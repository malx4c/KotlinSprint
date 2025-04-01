package lesson_6

fun main () {
    println("Регистция. Введите логин и пароль")
    val login = readln()
    val pass = readln()

    do  {
        println("Авторизация. Введите логин и пароль")
    } while (!(login == readln() && pass == readln()))

    println("Авторизация прошла успешно")
}