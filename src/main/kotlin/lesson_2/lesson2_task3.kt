package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinute = 457

    val minutes = departureHour * UNIT_OF_TIME + departureMinute + travelTimeMinute
    val arrivalHour = minutes / UNIT_OF_TIME
    val arrivalMinute = minutes % UNIT_OF_TIME

    println("Время прибытия: $arrivalHour:$arrivalMinute")
}

const val UNIT_OF_TIME = 60
