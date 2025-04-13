package lesson_14

fun main() {
    val planet =
        Planet(
            "Марс",
            false,
            true,
            listOf(
                Satellite("Деймос", false, false),
                Satellite("Фобос", false, false),
            ),
        )

    planet.printSatellites()
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandingPossible: Boolean,
    val satellites: List<Satellite>,
) : SkyBody(name, hasAtmosphere, isLandingPossible) {
    fun printSatellites() {
        println("Планета: $name")
        if (satellites.isNotEmpty()) {
            satellites.map { println("Спутник: ${it.name}") }
        } else {
            println("Не имеет спутников")
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandingPossible: Boolean,
) : SkyBody(name, hasAtmosphere, isLandingPossible)

open class SkyBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandingPossible: Boolean,
)
