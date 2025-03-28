package lesson_3

fun main() {
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val surName = "Сергеевна"
    val lastNameUpdate = "Сидорова"
    var age = 20
    val ageUpdate = 22

    println("$lastName $firstName $surName, $age")

    lastName = lastNameUpdate
    age =  ageUpdate
    println("$lastName $firstName $surName, $age")
}

