package lesson_3

fun main() {
    val receivedString = "D2-D4;0"

    val receivedData = receivedString.split("-",";")
    val source = receivedData[SOURCE_INDEX]
    val target = receivedData[TARGET_INDEX]
    val step = receivedData[STEP_INDEX]

    println(source)
    println(target)
    println(step)
}

const val SOURCE_INDEX = 0
const val TARGET_INDEX = 1
const val STEP_INDEX = 2

