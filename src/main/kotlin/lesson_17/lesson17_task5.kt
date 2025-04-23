package lesson_17.task5

fun main() {
    val user = User("admin", "1234")

    user.login = "super.admin"
    user.password = "qwerty"
    println("Пароль пользователя <${user.login}> : ${user.password}")
}

class User(
    private var _login: String,
    private val _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен.")
        }
    var password = _password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            return '*'.toString().repeat(field.length)
        }
}
