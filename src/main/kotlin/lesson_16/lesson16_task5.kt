package lesson_16

fun main() {
    val player = Player("Гордон Фримен", 5, 5)
    player.getStatus()

    for (i in 0..3) {
        player.setDamage()
    }

    player.setHealth()
    player.setHealth()

    for (i in 0..2) {
        player.setDamage()
    }

    player.setHealth()

    println()
    player.getStatus()
}

class Player(
    val name: String,
    private var health: Int,
    var impactForce: Int,
) {
    fun setDamage() {
        print("-Получение урона: ")
        if (health == 0) {
            println("Что мертво, умереть не может")
            return
        }

        health--
        if (health > 0) {
            println("$name получил урон, осталось здоровья $health")
        } else {
            healthIsEmpty()
        }
    }

    fun setHealth() {
        print("+Лечение: ")
        if (health != 0) {
            health++
            println("$name поправил здоровье до уровня $health")
        } else {
            println("$name мертв, его не оживить")
        }
    }

    fun getStatus() {
        println("<$name> здоровье: $health, сила: $impactForce, состояние: ${if (health == 0) "мертв" else "жив"}")
    }

    private fun healthIsEmpty() {
        impactForce = 0
        println("Игрок $name мертв.")
    }
}
