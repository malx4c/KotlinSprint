package lesson_20

fun main() {
    val getCongratulation: (String) -> String = { "С наступающим Новым Годом, $it!" }

    println(getCongratulation("Вася"))
}
