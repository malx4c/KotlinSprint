package lesson_17

fun main() {
    val package1 = Package(1, "Город 1")

    package1.printInfo()

    package1.locationPackage = "Город 2"
    package1.locationPackage = "Город 3"

    package1.printInfo()
}

class Package(
    val numberPackage: Int,
    private var _locationPackage: String,
) {
    private var countMoving: Int = 0

    var locationPackage = _locationPackage
        set(value) {
            field = value
            countMoving++
        }

    fun printInfo() {
        println("Посылка <$numberPackage> находится в <$locationPackage>, была перемещена $countMoving раз.")
    }
}
