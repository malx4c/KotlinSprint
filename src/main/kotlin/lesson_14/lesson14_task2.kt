package lesson_14.task2

fun main() {
    val ships =
        listOf(
            Liner("Liner", 30, 1500),
            CargoShip("CargoShip", 10, 2000),
            IceBreaker("IceBreaker", 5, true),
        )

    ships.forEach { it.printInfo() }
}

open class Liner(
    val name: String = DEF_NAME,
    val speed: Int = DEF_SPEED,
    val numberPassengers: Int = DEF_NUMBER_PASSENGERS,
) {
    open fun printInfo() {
        println("Название: $name")
        println("Скорость: $speed")
        println("Количество пассажиров: $numberPassengers")
    }

    open fun runLoading() {
        println("Выдвинуть горизонтальный трап со шкафута.")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    val liftingCapacity: Int,
) : Liner(name, speed) {
    override fun printInfo() {
        super.printInfo()
        println("Грузоподъемность: $liftingCapacity")
    }

    override fun runLoading() {
        println("Активировать погрузочный кран.")
    }
}

class IceBreaker(
    name: String,
    speed: Int,
    val canCrushIce: Boolean = true,
) : Liner(name, speed) {
    override fun printInfo() {
        super.printInfo()
        println("Может колоть лёд: $canCrushIce")
    }

    override fun runLoading() {
        println("Открыть ворота со стороны кормы.")
    }
}

const val DEF_NAME = "Ship"
const val DEF_SPEED = 25
const val DEF_NUMBER_PASSENGERS = 25
