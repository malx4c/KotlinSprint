package lesson_11

fun main() {
    val user1 = User (
        id = 1,
        login = "u1login",
        pass = "u1pass",
        email = "user1@user.xyz"
    )

    val user2 = User (
        id = 2,
        login = "u2login",
        pass = "u2pass",
        email = "user2@user.xyz"
    )

    println(user1.id)
    println(user1.login)
    println(user1.pass)
    println(user1.email)

    println(user2.id)
    println(user2.login)
    println(user2.pass)
    println(user2.email)
}