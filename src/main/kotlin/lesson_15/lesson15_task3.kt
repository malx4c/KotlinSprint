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

abstract class Participants {
    abstract val id: Int
    abstract val name: String

    fun readMessage() {
        println("$name читает сообщение")
    }

    fun writeMessage() {
        println("$name пишет сообщение")
    }
}

class User(
    override val id: Int,
    override val name: String,
) : Participants()

class Admin(
    override val id: Int,
    override val name: String,
) : Participants() {
    fun deleteMessage() {
        println("$name удаляет сообщение")
    }

    fun deleteUser() {
        println("$name удаляет пользователя")
    }
}
