package lesson_15

val cars: MutableList<Car> = mutableListOf()
val trucks: MutableList<Truck> = mutableListOf()

fun main() {
    cars.add(Car(getCarNameFake()))
    trucks.add(Truck(getTruckNameFake()))

    val numberPassenger = 5
    val cargoWeight = 2

    for (i in 1..numberPassenger) {
        if (cars.last().isFreePlace()) {
            cars.last().load()
        } else {
            cars.add(Car(getCarNameFake()))
            cars.last().load()
        }
    }

    for (i in 1..cargoWeight) {
        if (trucks.last().isFreePlace()) {
            trucks.last().load()
        } else {
            trucks.add(Truck(getTruckNameFake()))
            trucks.last().load()
        }
    }

    cars.forEach {
        it.run()
        it.stop()
        it.unload()
    }

    trucks.forEach {
        it.run()
        it.stop()
        it.unload()
    }
}

abstract class Vehicle(
    val name: String,
    val numberOfPassengers: Int,
) : Movement,
    Loading,
    UnLoading {
    abstract fun isFreePlace(): Boolean

    init {
        println("\tНовая $name")
    }
}

class Car(
    name: String,
    numberOfPassengers: Int = MAX_NUMBER_OF_PASSENGER,
) : Vehicle(name, numberOfPassengers) {
    private var currentNumberOfPassengers: Int = 0

    override fun isFreePlace(): Boolean = (currentNumberOfPassengers < numberOfPassengers)

    override fun load() {
        if (currentNumberOfPassengers <= numberOfPassengers) {
            currentNumberOfPassengers++
            println("$name: Открыть дверь, посадить пассажира N $currentNumberOfPassengers")
        }
    }

    override fun unload() {
        while (currentNumberOfPassengers != 0) {
            println("$name: Открыть дверь, высадить пассажира N $currentNumberOfPassengers")
            currentNumberOfPassengers--
        }
    }
}

class Truck(
    name: String,
    numberOfPassengers: Int = 1,
    val liftingCapacity: Int = MAX_LIFTING_CAPACITY,
) : Vehicle(name, numberOfPassengers) {
    private var currentCargoWeight: Float = 0F

    override fun isFreePlace(): Boolean = (currentCargoWeight < liftingCapacity)

    override fun load() {
        if (currentCargoWeight <= liftingCapacity) {
            currentCargoWeight++
            println("$name: Загружено $currentCargoWeight")
        }
    }

    override fun unload() {
        while (currentCargoWeight != 0f) {
            println("$name: Выгрузить груз, осталось $currentCargoWeight")
            currentCargoWeight--
        }
    }
}

interface Movement {
    fun run() {
        println("Начать движение")
    }

    fun stop() {
        println("Остановиться")
    }
}

interface Loading {
    fun load()
}

interface UnLoading {
    fun unload()
}

const val MAX_NUMBER_OF_PASSENGER = 3
const val MAX_LIFTING_CAPACITY = 2

fun getCarNameFake(): String = "Легковая машина ${cars.size + 1} "

fun getTruckNameFake(): String = "Грузовая машина ${trucks.size + 1} "
