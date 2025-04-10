package lesson_12

fun main() {
    val day1 = Weather2(
        dayTemperature = 300,
        nightTemperature = 290,
        hasPrecipitation = true
    )

    day1.printInfo()
}

class Weather2(
    dayTemperature: Int,
    nightTemperature: Int,
    hasPrecipitation: Boolean
) {
    var dayTemperature = (dayTemperature - KELVIN_CONVERSION_FACTOR).toInt()
    var nightTemperature = (nightTemperature - KELVIN_CONVERSION_FACTOR).toInt()
    var hasPrecipitation = hasPrecipitation

    fun printInfo() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $hasPrecipitation")
    }
}

const val KELVIN_CONVERSION_FACTOR = 273.15F

