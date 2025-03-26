package org.example.lesson_1

fun main () {
    val length: Long = 40868600000
    val length1 = 40868600000
    println(length1::class) //long (Kotlin reflection is not available)

    val age: Byte = 27
    val partOfDay: Double = 0.075
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
}