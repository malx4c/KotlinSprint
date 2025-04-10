package lesson_12.task5

fun main() {
    val days: MutableList<Weather> = mutableListOf()

    for (i in 0 until NUMBER_DAYS) {
        days.add(Weather(getDayTemp(), getNightTemp(), isPrecipitation()))
    }

    val daysTemperature = days.map { it.dayTemperature }
    val nightsTemperature = days.map { it.nightTemperature }
    val daysWithPrecipitation = days.filter { it.hasPrecipitation == true }.size
    val avgDayTemperature = daysTemperature.average().toInt()
    val avgNightTemperature = nightsTemperature.average().toInt()

    println("Средняя дневная температура: $avgDayTemperature")
    println("Средняя ночная температура: $avgNightTemperature")
    println("Дней с осадками: $daysWithPrecipitation")
}

class Weather(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitation: Boolean
)

fun getDayTemp(): Int {
    return (TEMPERATURE_DAY_RANGE.random())
}

fun getNightTemp(): Int {
    return (TEMPERATURE_NIGHT_RANGE.random())
}

fun isPrecipitation(): Boolean {
    return (0..1).random() == 1
}

const val NUMBER_DAYS = 30
val TEMPERATURE_DAY_RANGE = 20..30
val TEMPERATURE_NIGHT_RANGE = 15..25

