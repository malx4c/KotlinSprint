package lesson_20

fun main() {
    val player = Player("Вася")
    val therapy: (Player) -> Unit = { it.health = it.maxHealth }

    player.printHealth()

    therapy.invoke(player)

    player.printHealth()
}

class Player(
    val name: String,
    var health: Int = MAX_HEALTH / 2,
    val maxHealth: Int = MAX_HEALTH,
) {
    fun printHealth() {
        println("$name здоров на $health из $maxHealth")
    }
}

const val MAX_HEALTH = 100
