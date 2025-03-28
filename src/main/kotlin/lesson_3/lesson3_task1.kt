package lesson_3

fun main() {
    val nameUser = "Gordon"
    var messageWelcome: String

    messageWelcome = "$nameUser, $MESSAGE_WELCOME_DAY!"
    println(messageWelcome)

    messageWelcome = "$nameUser, $MESSAGE_WELCOME_EVENING!"
    println(messageWelcome)
}

const val MESSAGE_WELCOME_DAY = "good afternoon"
const val MESSAGE_WELCOME_EVENING = "good evening"
