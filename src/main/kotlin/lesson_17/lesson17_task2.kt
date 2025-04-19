package lesson_17

fun main() {
    val ship = Ship("Victoria", 10f, "Новороссийск")
    ship.name = "Беда"
}

class Ship(
    private var _name: String,
    val avgSpeed: Float,
    val homePort: String,
) {
    var name: String = _name
        set(value) {
            println("Имя корабаля нельзя поменять.")
        }
}
