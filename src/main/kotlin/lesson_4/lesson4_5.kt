package lesson_4

fun main() {
    val damage: Boolean
    val numberMembers: Int
    val numberFoodBox: Int
    val goodWeather: Boolean

    println("Есть повреждения?: ")
    damage = readln().toBoolean()
    println("Членов экипажа?: ")
    numberMembers = readln().toInt()
    println("Ящиков с едой?: ")
    numberFoodBox = readln().toInt()
    println("Погода благоприятная?: ")
    goodWeather = readln().toBoolean()

    val permission = damage == false && numberMembers in MIN_MEMBERS..MAX_MEMBERS && numberFoodBox > MIN_FOOT_BOX
    val permissionSimple = numberMembers == MAX_MEMBERS && numberFoodBox >= MIN_FOOT_BOX && goodWeather

    println("Корабль может отправлятся: ${permission || permissionSimple}")
}

const val MIN_MEMBERS = 55
const val MAX_MEMBERS = 70
const val MIN_FOOT_BOX = 50