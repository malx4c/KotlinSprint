package lesson_19

fun main() {
    val tank = Tank()
    for (ammo in TypeAmmo.entries) {
        tank.addAmmo(ammo)
        tank.shot()
    }
}

class Tank(
    private var ammo: TypeAmmo? = null,
) {
    fun addAmmo(ammo: TypeAmmo) {
        this.ammo = ammo
    }

    fun shot() {
        println("Выстрел снарядом силой: ${ammo?.impactForce}")
    }
}

enum class TypeAmmo(
    val impactForce: Int,
) {
    BLUE(5),
    GREEN(10),
    RED(20),
}
