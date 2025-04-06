package lesson_10.task_2
/*
Задача 3 к Уроку 10
Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и
специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля
и возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).
*/
fun main() {
    print("Введите длину пароля:")
    val passLength = readln().toInt()
    println(getPassword(passLength))
}

fun getPassword(length: Int): String {
    var result = ""
    val allChars = SPECIAL_CHARS + NUMBERS

    if (length <= 0 ) return ""
    if (length == 1) return allChars.random().toString()

    for ( i in 1..length - 2) {
            result += allChars.random()
    }

    result += SPECIAL_CHARS.random() + NUMBERS.random().toString()

    return result
}

val SPECIAL_CHARS = ' '..'/'
val NUMBERS = 0..9