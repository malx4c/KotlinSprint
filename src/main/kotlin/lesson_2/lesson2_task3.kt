package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinute = 457

    val minutes = departureHour * 60 + departureMinute + travelTimeMinute
    val arrivalHour = minutes / 60
    val arrivalMinute = minutes % 60

    println("Время прибытия: $arrivalHour:$arrivalMinute")
}