package lesson_20.task3

fun main() {
    val player = Player()
    val checkKey: (Player) -> String = { if (it.isHasKey) "Игрок открыл дверь" else "Дверь заперта" }

    println(checkKey(player))

    player.isHasKey = true

    println(checkKey(player))
}

class Player(
    var isHasKey: Boolean = false,
)
