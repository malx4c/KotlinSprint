package lesson_12.task2

fun main() {
    val day1 = Weather(
        dayTemperature = 15.5F,
        nightTemperature = 5F,
        hasPrecipitation = true
    )

    day1.printInfo()
}

class Weather(
    var dayTemperature: Float,
    var nightTemperature: Float,
    var hasPrecipitation: Boolean
) {

    fun printInfo() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $hasPrecipitation")
    }
}


