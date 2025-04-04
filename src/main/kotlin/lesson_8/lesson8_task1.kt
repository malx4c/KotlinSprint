package lesson_8

fun main() {
    val countViews = arrayOf(1,1,1,1,1,1,1)
    var totalViews = 0
    for (i in countViews) totalViews += i
    println(totalViews)
}