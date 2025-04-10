package lesson_12.task4

fun main() {
    val day1 = Weather2(
        dayTemperature = 300,
        nightTemperature = 290,
        hasPrecipitation = true
    )
}

class Weather2(
    dayTemperature: Int,
    nightTemperature: Int,
    hasPrecipitation: Boolean
) {
    var dayTemp = dayTemperature
    var nightTemp = nightTemperature
    var hasPrecipitation = hasPrecipitation

    init {
        printInfo()
    }

    fun printInfo() {
        println("Дневная температура: ${(dayTemp - KELVIN_CONVERSION_FACTOR).toInt()} ")
        println("Ночная температура: ${(nightTemp - KELVIN_CONVERSION_FACTOR).toInt()}")
        println("Осадки: $hasPrecipitation")
    }
}

const val KELVIN_CONVERSION_FACTOR = 273.15F

