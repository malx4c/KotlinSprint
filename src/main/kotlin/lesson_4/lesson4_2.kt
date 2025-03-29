package lesson_4

fun main() {
    var weight = 20
    var volume = 80
    var result = weight > WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $result")

    weight = 50
    volume = 100
    result = weight > WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $result")
}

const val WEIGHT_MIN = 35f
const val WEIGHT_MAX = 100f
const val VOLUME_MAX = 100f