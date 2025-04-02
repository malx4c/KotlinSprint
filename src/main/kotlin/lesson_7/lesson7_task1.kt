package lesson_7

fun main() {
    var pass = ""

    for (i in PASS_LEN downTo 1 step 2) {
        pass += SYMBOL_RANGE.random() + NUMBER_RANGE.random().toString()
    }
    println (pass)
}

val SYMBOL_RANGE = 'a'..'z'
val NUMBER_RANGE = 0..9
const val PASS_LEN = 6
