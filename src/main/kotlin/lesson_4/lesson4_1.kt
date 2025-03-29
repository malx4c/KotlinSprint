package lesson_4

fun main() {
    val reservedTablesToday = TOTAL_TABLES
    val reservedTablesTomorrow = 9

    println ("Доступность столиков на сегодня: ${reservedTablesToday != TOTAL_TABLES}")
    println ("Доступность столиков на завтра: ${reservedTablesTomorrow != TOTAL_TABLES}")
}

const val TOTAL_TABLES = 13