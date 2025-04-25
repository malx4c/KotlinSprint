package lesson_21.task5

fun main() {
    val skill: Map<String, Int> =
        mapOf(
            ("Ловкость" to 50),
            ("Сила" to 25),
            ("Выносливость" to 70),
            ("Харизма" to 70),
            ("Восприятие" to 50),
            ("Восприятие" to 65),
            ("Удача" to 10),
        )

    println("Макисмальный навык: ${skill.maxCategory()}")
}

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key
