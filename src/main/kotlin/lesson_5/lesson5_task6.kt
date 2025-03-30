package lesson_5

fun main() {
    val weight: Float
    var height: Double

    println("Вес:")
    weight = readln().toFloat()

    println("Рост:")
    height = readln().toDouble()
    height /= CENTIMETERS_IN_METER

    val bodyMassIndex = weight / Math.pow(height, 2.0)
    print(String.format("Ваш индекс массы тела: %.2f\n",bodyMassIndex))

    val message = when (true) {
        (bodyMassIndex < BMI_MIN)  -> "Недостаточная масса тела"
        (bodyMassIndex >= BMI_MIN &&  bodyMassIndex < BMI_NORMAL)  -> "Нормальная масса тела"
        (bodyMassIndex >= BMI_NORMAL &&  bodyMassIndex < BMI_CRITICAL)  -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(message)
}
const val CENTIMETERS_IN_METER = 100
const val BMI_MIN = 18.5
const val BMI_NORMAL = 25.0
const val BMI_CRITICAL = 30.0



