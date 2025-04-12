package lesson_13.task3

fun main() {
    val contactList: List<Contact> =
        listOf(
            Contact("Вася", 12345, null),
            Contact("Петя", 67890, null),
            Contact("Маша", 54321, "null"),
            Contact("Вова", 54321, "null"),
            Contact("Ира", 98765, "ИП Ира"),
            Contact("Коля", 19283, "ООО Коля"),
            Contact("Коля", 19283, "ООО Коля"),
        )

    val companies = contactList.mapNotNull { it.company }.distinct()
    companies.forEach { println(it) }
}

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)
