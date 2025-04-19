package lesson_17

fun main() {
    val q = Quiz("q1", "a1")
    q.printInfo()
    q.answer = "a2"
    q.printInfo()
}

class Quiz(
    private val _question: String,
    private val _answer: String,
) {
    val question: String = _question
        get() = field

    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }

    fun printInfo() {
        println("Вопрос <$question> ответ <$answer>")
    }
}
