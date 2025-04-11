package lesson_13

/*
Задача 2 к Уроку 13
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.
Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и
без использования многострочного ввода такого типа (пример):
- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit
Вместо null значения, в консоль должна выводиться строка <не указано>.
 */

fun main() {
    val contact = Contact2(
        name = "Вася",
        phoneNumber = 12345567,
        company = null
    )

    val contact2 = Contact2(
        name = "Петя",
        phoneNumber = 7654321,
        company = "Company Name"
    )

    contact.printInfo()
    contact2.printInfo()
}

class Contact2(
    val name: String,
    val phoneNumber: Long,
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

