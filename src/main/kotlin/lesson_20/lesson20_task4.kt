package lesson_20

fun main() {
    val controls = listOf("Кнопка1", "Кнопка2", "Кнопка3", "Кнопка4", "Кнопка5", "Кнопка6")
    val controlsAction = controls.map { { println("Нажат элемент $it") } }

    controlsAction.filterIndexed { index, _ -> (index % 2 != 0) }.forEach { it() }
}
