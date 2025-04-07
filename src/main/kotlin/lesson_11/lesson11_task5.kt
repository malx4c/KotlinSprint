package lesson_11.task5

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Петя")
    val user2 = forum.createNewUser("Маша")

    forum.createNewMessage(user1.userId,"Сообщение 1")
    forum.createNewMessage(user1.userId,"Сообщение 2")
    forum.createNewMessage(user2.userId,"Сообщение 3")
    forum.createNewMessage(user2.userId,"Сообщение 4")

    forum.printThread()
}

class Forum() {
    var members: MutableList<Member> = mutableListOf()
    var messages: MutableList<Message> = mutableListOf()
    private var idMember = 0

    fun createNewUser(userName: String): Member {
        val user = MemberBuilder()
            .userId(getIdMember())
            .userName(userName)
            .build()

        members.add(user)

        return user
    }

    fun createNewMessage(userId: Int, userMessage: String) {
        if (members.find { it.userId == userId } != null) {
            val message = MessageBuilder()
                .authorId(userId)
                .message(userMessage)
                .build()

            messages.add(message)
        }
    }

    fun printThread() {
        for (message in messages) {
            val member = members.find { it.userId == message.authorId}
            println("${member!!.userName}: ${message.message}")
        }
    }

    private fun getIdMember(): Int {
        return idMember++
    }
}

class Member (
    val userId: Int,
    val userName: String
)

class MemberBuilder() {
    var userId: Int = 0
    var userName: String = ""

    fun userId(userId: Int): MemberBuilder {
        this.userId = userId
        return this
    }

    fun userName(userName: String): MemberBuilder {
        this.userName = userName
        return this
    }

    fun build(): Member {
        return Member (
            userId = userId,
            userName = userName)
    }
}

class Message (
    val authorId: Int,
    val message: String
)

class MessageBuilder () {
    var authorId: Int = 0
    var message: String = ""

    fun authorId(authorId: Int): MessageBuilder {
        this.authorId = authorId
        return this
    }

    fun message(message: String): MessageBuilder {
        this.message = message
        return this
    }

    fun build(): Message {
        return Message (
            authorId = authorId,
            message = message)
    }
}
