package lesson_4

fun main() {
    val weightMin = 35f
    val weightMax = 100f
    val volumeMax = 100f

    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > weightMin && weight <= weightMax && volume < volumeMax}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > weightMin && weight <= weightMax && volume < volumeMax}")

}

