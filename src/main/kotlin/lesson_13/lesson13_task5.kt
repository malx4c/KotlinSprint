package lesson_13.task5

/*
Задача 5* к Уроку 13
Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название для избегания конфликтов.
Для получения номера программа считывает ввод пользователя с типом String по умолчанию. Приведи строку к типу Long.
Если пользователь ввел что-либо, кроме цифр — программа падает.
Необходимо избежать падения программы при попытке приведения строки к типу Long. Отлови ошибку и выведи ее название в консоль.
* */
fun main() {
    for (i in 1..NUMBER_CONTACTS) {
        val phone = getPhoneNumber()
        println(phone)
    }
}

fun getPhoneNumber(): Long? {
    print("Введите номер телефона: ")
    val phoneInput = readln()

    return try {
        phoneInput.toLong()
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
        null
    }
}

class Contact(
    val name: String,
    val phoneNumber: Int,
    val company: String?
) {

    fun printInfo() {
        var info = "- Имя: $name\n"
        info += "- Номер телефона: $phoneNumber\n"
        info += "- Компания: ${company ?: BLANK_TEXT}\n"

        println(info)
    }
}

const val BLANK_TEXT = "<не указано>"
const val NUMBER_CONTACTS = 5