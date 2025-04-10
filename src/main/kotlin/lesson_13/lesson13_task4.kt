package lesson_13.task4

/*
Задача 4 к Уроку 13
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).
- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- если пользователь не заполнил компанию, то в объект записывать null.
Выведи созданные объекты в консоль методом класса.
 */
fun main() {
    val contactList: MutableList<Contact> = mutableListOf()

    for (i in 1..NUMBER_CONTACTS) {

        val name = getName()
        val phone = getPhoneNumber()

        if (phone != null) {
            val company = getCompany()
            contactList.add(
                Contact(
                    name = name,
                    phoneNumber = phone,
                    company = company.ifEmpty { null })
            )
        }
    }

    if (contactList.size > 0) contactList.map { it.printInfo() }
}

fun getName(): String {
    print("Введите имя:")
    return readln()
}

fun getPhoneNumber(): Long? {
    print("Введите номер телефона: ")
    val phoneNumber = readln().toLongOrNull()

    if (phoneNumber == null) println("Номер телефона не указан, контакт не будет сохранен.")

    return phoneNumber
}

fun getCompany(): String {
    print("Введите компанию, или ничего: ")
    return readln().trim()
}

class Contact(
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
const val NUMBER_CONTACTS = 3