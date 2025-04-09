package lesson_11.task5

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Петя")
    val user2 = forum.createNewUser("Маша")

    forum.createNewMessage(user1.userId, "Сообщение 1")
    forum.createNewMessage(user1.userId, "Сообщение 2")
    forum.createNewMessage(user2.userId, "Сообщение 3")
    forum.createNewMessage(user2.userId, "Сообщение 4")

    forum.printThread()
}

class Forum() {
    var members: MutableList<Member> = mutableListOf()
    var messages: MutableList<Message> = mutableListOf()
    private var idMember = 0

    fun createNewUser(userName: String): Member {
        val user = Member(userId = getIdMember(), userName = userName)
        members.add(user)

        return user
    }

    fun createNewMessage(userId: Int, userMessage: String) {
        if (members.find { it.userId == userId } != null) {
            val message = Message(authorId = userId, message = userMessage)

            messages.add(message)
        }
    }

    fun printThread() {
        for (message in messages) {
            val member = members.find { it.userId == message.authorId }
            if (member != null) println("${member.userName}: ${message.message}")
        }
    }

    private fun getIdMember(): Int {
        return idMember++
    }
}

class Member(
    val userId: Int,
    val userName: String
)

class Message(
    val authorId: Int,
    val message: String
)