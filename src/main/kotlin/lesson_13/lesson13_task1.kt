package lesson_13

fun main() {
    val contact =
        Contact(
            name = "Вася",
            phoneNumber = 12345567,
            company = null,
        )
}

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)
