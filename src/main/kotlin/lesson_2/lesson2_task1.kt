package org.example.lesson_2

fun main() {
    val countStudent = 4
    val averageRating = (((3 + 4 + 3 + 5).toFloat() / countStudent))
    println(String.format("Средняя оценка %d учеников: %.2f", countStudent, averageRating))
}