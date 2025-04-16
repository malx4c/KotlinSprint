package lesson_15

fun main() {
    val temperature = Temperature(25.5F)
    val precipitationAmount = PrecipitationAmount(10)
    val fake = Fake(name = "", value = null)

    val server = WeatherServer()

    server.sendWeatherData(temperature)
    server.sendWeatherData(precipitationAmount)
    server.sendWeatherData(fake)
}

abstract class WeatherStationStats {
    abstract val name: String
    abstract val value: Any?

    fun isValid() = name.isNotEmpty() && value != null
}

class Fake(
    override val name: String,
    override val value: Any?,
) : WeatherStationStats()

class Temperature(
    override val value: Float?,
) : WeatherStationStats() {
    override val name = "Температура"
}

class PrecipitationAmount(
    override val value: Int?,
) : WeatherStationStats() {
    override val name = "Количество осадков"
}

class WeatherServer {
    fun sendWeatherData(weatherData: WeatherStationStats) {
        if (weatherData.isValid()) {
            println("Датчик <${weatherData.name}>: ${weatherData.value}")
        } else {
            println("Данные не распознаны")
        }
    }
}
