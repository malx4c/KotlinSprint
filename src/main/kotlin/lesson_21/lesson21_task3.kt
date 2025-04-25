package lesson_21.task3

fun main() {
    val player = Player("Вася")
    println("Здоровье максимальное ?: ${player.isHealthy()}")
    player.health = player.maxHealth
    println("Здоровье максимальное ?: ${player.isHealthy()}")
}

fun Player.isHealthy(): Boolean = this.health == this.maxHealth

class Player(
    val name: String,
    var health: Int = MAX_HEALTH / 2,
    val maxHealth: Int = MAX_HEALTH,
)

const val MAX_HEALTH = 100
