package lesson_4

fun main() {
   val sunnyWeather: Boolean
   val coverOpen: Boolean
   val humidity: Int
   val timeOfYear: String

   sunnyWeather  = true
   coverOpen = true
   humidity = 20
   timeOfYear  = "зима"

   val result = sunnyWeather == SUNNY && coverOpen == COVER && humidity == HUMIDITY && timeOfYear !== WINTER
   println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

const val COVER = true
const val SUNNY = true
const val HUMIDITY= 20
const val WINTER= "зима"