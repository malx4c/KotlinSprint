package org.example.lesson_1

fun main () {
    val totalSeconds = 6480
    val hours = totalSeconds / (UNIT_OF_TIME * UNIT_OF_TIME)
    val remainingSeconds = totalSeconds % (UNIT_OF_TIME * UNIT_OF_TIME)
    val minutes = remainingSeconds / UNIT_OF_TIME
    val seconds = remainingSeconds % UNIT_OF_TIME

    println (String.format("%02d:%02d:%02d", hours, minutes, seconds))
}

const val UNIT_OF_TIME = 60
