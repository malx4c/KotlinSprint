package lesson_14

/*
Задача 5* к Уроку 14
Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord. Класс должен иметь следующие методы:
- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения),
дополнительно принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat.
Для создания сообщений соответствующих типов используй классы Message и ChildMessage в соответствующей иерархии.
У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить для вывода
табуляцию и печатать его под родительским сообщением.

Используй groupBy() для группировки сообщений по parentMessageId,
если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.

 */

fun main() {
    val member1 = Member(1, "Вася")
    val member2 = Member(2, "Петя")
    val chat = Chat()
    chat.addMessage(member1, "привет1")
    chat.addMessage(member2, "привет2")
    chat.addMessage(member1, "привет3")
    chat.addMessage(member1, "привет4")

    chat.addThreadMessage(member2, "привет201", 2)
    chat.addThreadMessage(member1, "привет202", 2)
    chat.addThreadMessage(member2, "привет203", 2)
    chat.addThreadMessage(member1, "привет401", 4)

    chat.printChat()
}

open class Message(
    val id: Int,
    val member: Member,
    val message: String,
)

class ChildMessage(
    id: Int,
    member: Member,
    message: String,
    val parentMessageId: Int,
) : Message(id, member, message)

class Chat {
    var messages: MutableList<Message> = mutableListOf()
    private var messageId = 1

    fun addMessage(
        member: Member,
        message: String,
    ) {
        messages.add(Message(messageId++, member, message))
    }

    fun addThreadMessage(
        member: Member,
        message: String,
        parentMessageId: Int,
    ) {
        messages.add(ChildMessage(messageId++, member, message, parentMessageId))
    }

    fun printChat() {
        val groupMessage = messages.groupBy({ if (it is ChildMessage) it.parentMessageId else it.id })
        groupMessage.forEach {
            it.value.forEach {
                println(
                    if (it is ChildMessage) {
                        "\t${it.member.name}: ${it.message}"
                    } else {
                        "${it.member.name}: ${it.message}"
                    },
                )
            }
        }
    }
}

class Member(
    val id: Int,
    val name: String,
)
