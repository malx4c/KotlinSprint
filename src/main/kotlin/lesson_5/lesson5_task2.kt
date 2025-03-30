package lesson_5
import java.time.LocalDate

fun main() {
    val userAge = readln().toInt()
    val currentYear = LocalDate.now().year

    if (currentYear - userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Доступ запрещен.")
}

const val AGE_OF_MAJORITY = 18
