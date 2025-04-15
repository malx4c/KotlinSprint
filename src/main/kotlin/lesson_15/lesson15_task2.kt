package lesson_15

fun main() {
    val temperature = Temperature(25.5F)
    val precipitationAmount = PrecipitationAmount(10)
    val server = WeatherServer()

    server.sendWeatherData(temperature)
    server.sendWeatherData(precipitationAmount)
}

abstract class WeatherStationStats {
    abstract val name: String
    abstract val value: Any
}

class Temperature(
    override val value: Float,
) : WeatherStationStats() {
    override val name = "Температура"
}

class PrecipitationAmount(
    override val value: Int,
) : WeatherStationStats() {
    override val name = "Количество осадков"
}

class WeatherServer {
    fun sendWeatherData(weatherData: WeatherStationStats) {
        println("Датчик <${weatherData.name}>: ${weatherData.value}")
    }
}
