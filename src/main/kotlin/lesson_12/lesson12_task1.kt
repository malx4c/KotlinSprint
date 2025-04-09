package lesson_12

fun main() {
    val day1 = Weather()
    val day2 = Weather()

    day1.dayTemperature = 15.5F
    day1.nightTemperature = 5F
    day1.hasPrecipitation = true

    day2.dayTemperature = 0F
    day2.nightTemperature = -5F
    day2.hasPrecipitation = true

    day1.printInfo()
    day2.printInfo()
}

class Weather() {
    var dayTemperature = 0F
    var nightTemperature = 0F
    var hasPrecipitation = false

    fun printInfo() {
        println("dayTemp: $dayTemperature")
        println("nightTemp: $nightTemperature")
        println("hasPrecipitation: $hasPrecipitation")
    }
}


