package lesson_7

fun main() {

    print("Введите длину пароля не меньше 6: ")
    val passLenght = readln().toInt()
    if (passLenght < MIN_PASS_LENGHT) return

    val charLower = 'a'..'z'
    val charUpper = 'A'..'Z'
    val numbers =  0..9
    val allChars= charLower + charUpper + numbers
    var pass = "${charLower.random()}${numbers.random()}${charUpper.random()}"

    for (i in 1..passLenght - 3) {
        pass += allChars.random()
    }

    println(pass)
}

const val MIN_PASS_LENGHT = 6

