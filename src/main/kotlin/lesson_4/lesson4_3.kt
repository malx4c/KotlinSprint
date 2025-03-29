package lesson_4

fun main() {
   val sunnyWeather = true
   val coverOpen = true
   val humidity = 20
   val timeOfYear = "зима"

   println("Благоприятные ли условия сейчас для роста бобовых? ${sunnyWeather && coverOpen && humidity == 20 && timeOfYear !== "зима"}")
}

