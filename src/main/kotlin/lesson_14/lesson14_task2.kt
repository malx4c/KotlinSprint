package lesson_14.task2

fun main() {
    val ships =
        listOf(
            Liner("Liner", numberPassengers = 2000),
            CargoShip("CargoShip"),
            IceBreaker("IceBreaker"),
        )

    ships.forEach {
        it.printInfo()
        it.runLoading()
    }
}

open class Liner(
    open val name: String,
    val speed: Int = DEF_SPEED,
    val liftingCapacity: Int = DEF_LIFTING_CAPACITY,
    val numberPassengers: Int = DEF_NUMBER_PASSENGERS,
    val canCrushIce: Boolean = false,
) {
    fun printInfo() {
        println("Название: $name")
        println("Скорость: $speed")
        println("Количество пассажиров: $numberPassengers")
        println("Грузоподъемность: $liftingCapacity")
        println("Способен колоть лед: $canCrushIce")
    }

    open fun runLoading() {
        println("Выдвинуть горизонтальный трап со шкафута.")
    }
}

class CargoShip(
    override val name: String,
) : Liner(
        name = name,
        speed = 15,
        liftingCapacity = 5000,
) {
    override fun runLoading() {
        println("Активировать погрузочный кран.")
    }
}

class IceBreaker(
    override val name: String,
) : Liner(
        name = name,
        speed = 10,
        canCrushIce = true,
) {
    override fun runLoading() {
        println("Открыть ворота со стороны кормы.")
    }
}

const val DEF_SPEED = 25
const val DEF_NUMBER_PASSENGERS = 25
const val DEF_LIFTING_CAPACITY = 100
