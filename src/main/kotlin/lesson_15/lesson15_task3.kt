package lesson_15

fun main() {
    val user = User(1, "Вася")
    val admin = Admin(2, "Петя")

    user.readMessage()
    user.writeMessage()

    admin.readMessage()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}

abstract class Participants(
    val id: Int,
    val name: String,
) {
    fun readMessage() {
        println("$name читает сообщение")
    }

    fun writeMessage() {
        println("$name пишет сообщение")
    }
}

class User(
    id: Int,
    name: String,
) : Participants(id, name)

class Admin(
    id: Int,
    name: String,
) : Participants(id, name) {
    fun deleteMessage() {
        println("$name удаляет сообщение")
    }

    fun deleteUser() {
        println("$name удаляет пользователя")
    }
}
