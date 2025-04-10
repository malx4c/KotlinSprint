package lesson_13.task3

/*
Задача 3 к Уроку 13
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.
 */
fun main() {
    val contactList: List<Contact> = listOf(
        Contact("Вася", 12345, null),
        Contact("Петя", 67890, null),
        Contact("Маша", 54321, "null"),
        Contact("Ира", 98765, "ИП Ира"),
        Contact("Коля", 19283, "ООО Коля"),
    )

    val companies = contactList.mapNotNull { it.company }
    companies.forEach { println(it) }
}

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

const val BLANK_TEXT = "<не указано>"
