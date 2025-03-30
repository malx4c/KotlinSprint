package lesson_5

fun main() {
    val distance: Float
    val fuelConsumption: Float
    val price: Float

    print("Расстояние поездки (в километрах): ")
    distance = readln().toFloat()
    print("Расход топлива на 100 км (в литрах): ")
    fuelConsumption = readln().toFloat()
    print("Текущая цену за литр топлива: ")
    price = readln().toFloat()

    val totalFuelConsumption = distance * fuelConsumption / 100
    val totalPrice = totalFuelConsumption * price

    println (String.format("Количество топлива %.2f литров, стоимость %.2f", totalFuelConsumption, totalPrice))
}



