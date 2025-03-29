package lesson_4

fun main() {
   val day = 5
   val evenDay = day % 2 == 0

   val message = """
      Упражнения для рук:    ${!evenDay}
      Упражнения для ног:    $evenDay
      Упражнения для спины:  $evenDay
      Упражнения для пресса: ${!evenDay}
   """.trimIndent()

   println (message)
}

