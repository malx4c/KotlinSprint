package lesson_14

fun main() {
    val liner = Liner("Liner", numberPassengers = 2000)
    val cargoShip = CargoShip("CargoShip")
    val iceBreaker = IceBreaker("IceBreaker")
}

open class Liner(
    val name: String,
    val speed: Int = DEF_SPEED,
    val liftingCapacity: Int = DEF_LIFTING_CAPACITY,
    val numberPassengers: Int = DEF_NUMBER_PASSENGERS,
    val canCrushIce: Boolean = false,
)

class CargoShip(
    name: String,
    speed: Int = 15,
    liftingCapacity: Int = 1000,
) : Liner(name, speed, liftingCapacity)

class IceBreaker(
    name: String,
    speed: Int = 10,
    liftingCapacity: Int = 200,
    canCrushIce: Boolean = true,
) : Liner(name, speed, liftingCapacity)

const val DEF_SPEED = 25
const val DEF_NUMBER_PASSENGERS = 25
const val DEF_LIFTING_CAPACITY = 100
