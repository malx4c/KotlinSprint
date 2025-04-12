package lesson_14

fun main() {
    val liner = Liner("Liner", 30, 1500)
    val cargo = CargoShip("CargoShip", 10, 2000)
    val iceBreaker = IceBreaker("IceBreaker", 5, true)
}

open class Liner(
    val name: String = DEF_NAME,
    val speed: Int = DEF_SPEED,
    val numberPassengers: Int = DEF_NUMBER_PASSENGERS,
)

class CargoShip(
    name: String,
    speed: Int,
    val liftingCapacity: Int,
) : Liner(name, speed)

class IceBreaker(
    name: String,
    speed: Int,
    val canCrushIce: Boolean = true,
) : Liner(name, speed)

const val DEF_NAME = "Ship"
const val DEF_SPEED = 25
const val DEF_NUMBER_PASSENGERS = 25
