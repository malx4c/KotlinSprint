package lesson_7

fun main() {

    print("Введите длину пароля не меньше 6: ")
    val passLenght = readln().toInt()
    if (passLenght < MIN_PASS_LENGHT) return

    var pass = ""
    val charLower = 'a'..'z'
    val charUpper = 'A'..'Z'
    val numbers =  0..9

    for (i in 1..passLenght - 3) {
        if ((0..1).random() == 1) {
            pass += (charLower + charUpper).random()
        } else
            pass += numbers.random().toString()
    }
    pass += "${charLower.random()}${numbers.random()}${charUpper.random()}"
    println(pass)
}

const val MIN_PASS_LENGHT = 6

