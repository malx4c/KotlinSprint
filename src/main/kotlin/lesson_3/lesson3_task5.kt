package lesson_3

fun main() {
    val receivedString = "D2-D4;0"
    val source = receivedString.slice(SOURCE_INDEX_BEGIN..SOURCE_INDEX_END)
    val target = receivedString.slice(TARGET_INDEX_BEGIN..TARGET_INDEX_END)
    val step = receivedString.substring(STEP_INDEX_BEGIN, STEP_INDEX_END)

    println(source)
    println(target)
    println(step)
}

const val SOURCE_INDEX_BEGIN = 0
const val SOURCE_INDEX_END = 1
const val TARGET_INDEX_BEGIN = 3
const val TARGET_INDEX_END = 4
const val STEP_INDEX_BEGIN = 6
const val STEP_INDEX_END = 7
