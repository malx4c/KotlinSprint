package lesson_13.task5

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

const val NUMBER_CONTACTS = 5
