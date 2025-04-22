package lesson_18.task3

fun main() {
    val animals: List<Animal> =
        listOf(
            Fox(),
            Dog(),
            Cat(),
        )
    animals.forEach { it.eat() }
}

abstract class Animal(
    val name: String,
) {
    abstract fun eat()

    fun sleep() {
        println("$name спит")
    }
}

class Fox(
    name: String = "Лиса",
) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(
    name: String = "Собака",
) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(
    name: String = "Кошка",
) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}
