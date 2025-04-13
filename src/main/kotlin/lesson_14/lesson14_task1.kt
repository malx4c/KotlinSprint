package lesson_14

fun main() {
    val liner = Liner("Liner", 30, 1500)
    val cargo = CargoShip("CargoShip")
    val iceBreaker = IceBreaker("IceBreaker")
}

open class Liner(
    val name: String = DEF_NAME,
    open val speed: Int = DEF_SPEED_LINER,
    val numberPassengers: Int = DEF_NUMBER_PASSENGERS,
)

class CargoShip(
    name: String,
    override val speed: Int = DEF_SPEED_CARGO_SHIP,
    val liftingCapacity: Int = DEF_LIFTING_CAPACITY,
) : Liner(name)

class IceBreaker(
    name: String,
    override val speed: Int = 5,
    val canCrushIce: Boolean = true,
) : Liner(name)

const val DEF_NAME = "Ship"
const val DEF_SPEED_LINER = 25
const val DEF_SPEED_CARGO_SHIP = 25
const val DEF_NUMBER_PASSENGERS = 25
const val DEF_LIFTING_CAPACITY = 200
