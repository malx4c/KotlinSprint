package lesson_16

fun main() {
    val user = User("user", "1234")
    println("Пароль верный: ${user.isValidPassword("4321")}")
}

class User(
    val login: String,
    private val password: String,
) {
    fun isValidPassword(password: String): Boolean = this.password == password
}
