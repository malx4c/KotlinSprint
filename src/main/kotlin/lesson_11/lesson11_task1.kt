package lesson_11.task1

fun main() {
    val user1 = User(
        id = 1,
        login = "u1login",
        password = "u1pass",
        email = "user1@user.xyz"
    )

    val user2 = User(
        id = 2,
        login = "u2login",
        password = "u2pass",
        email = "user2@user.xyz"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)