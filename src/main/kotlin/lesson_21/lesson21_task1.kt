package lesson_21

fun main() {
    val text = "Hello WORLD"
    println(text.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "AEIOU"
    return this.uppercase().count { it in vowels }
}
