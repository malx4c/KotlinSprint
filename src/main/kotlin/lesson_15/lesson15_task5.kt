package lesson_15

fun main() {
    val cars: MutableList<Car> = mutableListOf()
    val trucks: MutableList<Truck> = mutableListOf()

    cars.add(Car(getCarNameFake()))
    trucks.add(Truck(getTruckNameFake()))

    val numberPassenger = 5
    val cargoWeight = 2

    for (i in 1..numberPassenger) {
        if (cars.last().isFreePlace()) {
            cars.last().loadPassenger()
        } else {
            cars.add(Car(getCarNameFake(cars.size)))
            cars.last().loadPassenger()
        }
    }

    for (i in 1..cargoWeight) {
        if (trucks.last().isFreePlace()) {
            trucks.last().loadPassenger()
        } else {
            trucks.add(Truck(getTruckNameFake(trucks.size)))
            trucks.last().load()
        }
    }

    cars.forEach {
        it.run()
        it.stop()
        it.unloadPassenger()
    }

    trucks.forEach {
        it.run()
        it.stop()
        it.unload()
    }
}

class Car(
    val name: String,
    val numberOfPassengers: Int = MAX_NUMBER_OF_PASSENGER,
) : Movement,
    PassengerTransportable {
    override val maxNumberOfPassengers = numberOfPassengers
    override var currentNumberOfPassengers = 0

    fun isFreePlace(): Boolean = (currentNumberOfPassengers < numberOfPassengers)
}

class Truck(
    val name: String,
    val numberOfPassengers: Int = 1,
    val liftingCapacity: Int = MAX_LIFTING_CAPACITY,
) : Movement,
    CargoTransportable,
    PassengerTransportable {
    override val maxLiftingCapacity = liftingCapacity
    override var currentCargoWeight = 0F
    override val maxNumberOfPassengers = numberOfPassengers
    override var currentNumberOfPassengers = 0

    fun isFreePlace(): Boolean = (currentCargoWeight < liftingCapacity)
}

interface Movement {
    fun run() = println("Начать движение")

    fun stop() = println("Остановиться")
}

interface PassengerTransportable {
    val maxNumberOfPassengers: Int
    var currentNumberOfPassengers: Int

    fun loadPassenger() {
        if (currentNumberOfPassengers <= maxNumberOfPassengers) {
            currentNumberOfPassengers++
            println("Открыть дверь, посадить пассажира N $currentNumberOfPassengers")
        }
    }

    fun unloadPassenger() {
        while (currentNumberOfPassengers != 0) {
            println("Открыть дверь, высадить пассажира N $currentNumberOfPassengers")
            currentNumberOfPassengers--
        }
    }
}

interface CargoTransportable {
    val maxLiftingCapacity: Int
    var currentCargoWeight: Float

    fun load() {
        if (currentCargoWeight <= maxLiftingCapacity) {
            currentCargoWeight++
            println("Загружено $currentCargoWeight")
        }
    }

    fun unload() {
        while (currentCargoWeight != 0f) {
            println("Выгрузить груз, осталось $currentCargoWeight")
            currentCargoWeight--
        }
    }
}

const val MAX_NUMBER_OF_PASSENGER = 3
const val MAX_LIFTING_CAPACITY = 2

fun getCarNameFake(size: Int = 0): String = "Легковая машина ${size + 1} "

fun getTruckNameFake(size: Int = 0): String = "Грузовая машина ${size + 1} "
