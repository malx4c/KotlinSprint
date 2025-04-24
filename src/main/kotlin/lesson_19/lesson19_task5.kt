package lesson_19

class Person(
    val name: String,
    val gender: Gender,
)

enum class Gender(
    val description: String,
) {
    MALE("мужчина"),
    FEMALE("женщина"),
    NOT_SPECIFIED("не указан"),
}

fun main() {
    val numberOfPeoples = 5
    var inputData: List<String>
    val persons: MutableList<Person> = mutableListOf()

    printManual()
    println()
    println("Введите данные (всего $numberOfPeoples человек)")

    for (i in 1..numberOfPeoples) {
        print("Человек $i: ")
        inputData = readln().trim().split(' ')
        if (validateInput(inputData)) {
            val name = inputData[0]
            val gender = Gender.entries[inputData[1].toInt()]
            persons.add(Person(name, gender))
        } else {
            printError()
        }
    }

    println("\nДобавлено человек: ${persons.size}")
    persons.map { println("Имя: ${it.name} Пол: ${it.gender.description}") }
}

fun printManual() {
    println("Введите данные человека в формате Имя:<пробел>Пол:\nДопустимые значения для выбора пола:")

    for (gender in Gender.entries) {
        println("\t${gender.ordinal} - ${gender.description} ")
    }
}

fun validateInput(inputData: List<String>): Boolean {
    var result = false
    try {
        result = (inputData[0].isNotEmpty()) && (inputData[1].toInt() in 0 until Gender.entries.size)
    } finally {
        return result
    }
}

fun printError() {
    println("Ошибка при вводе имени, или пола. Даныне не будут добавлены")
}
