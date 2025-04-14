package lesson_14

fun main() {
    val liner = Liner("Liner", numberPassengers = 2000)
    val cargoShip = CargoShip("CargoShip")
    val iceBreaker = IceBreaker("IceBreaker")
}

open class Liner(
    open val name: String,
    val speed: Int = DEF_SPEED,
    val liftingCapacity: Int = DEF_LIFTING_CAPACITY,
    val numberPassengers: Int = DEF_NUMBER_PASSENGERS,
    val canCrushIce: Boolean = false,
)

class CargoShip(
    override val name: String,
) : Liner(
        name = name,
        speed = 15,
        liftingCapacity = 5000,
)

class IceBreaker(
    override val name: String,
) : Liner(
        name = name,
        speed = 10,
        canCrushIce = true,
)

const val DEF_SPEED = 25
const val DEF_NUMBER_PASSENGERS = 25
const val DEF_LIFTING_CAPACITY = 100
