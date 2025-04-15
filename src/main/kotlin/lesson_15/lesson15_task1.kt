package lesson_15

/*
Задача 1 к Уроку 15
В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.
 */

fun main() {
    val crucian = Crucian("Карась")
    crucian.swim()

    val duck = Duck("Утка")
    duck.swim()
    duck.fly()

    val gull = SeaGull("Чайка")
    gull.swim()
    gull.fly()
}

abstract class Creature {
    abstract val name: String
}

class Crucian(
    override val name: String,
) : Creature(),
    FloatingCreature {
    override fun swim() {
        println("Карась плавает глубоко")
    }
}

class Duck(
    override val name: String,
) : Creature(),
    FlyingCreature,
    FloatingCreature {
    override fun swim() {
        println("Утка плавает и ныряет")
    }

    override fun fly() {
        println("Утка летает не высоко")
    }
}

class SeaGull(
    override val name: String,
) : Creature(),
    FlyingCreature,
    FloatingCreature {
    override fun swim() {
        println("Чайка плавает по поверхности")
    }

    override fun fly() {
        println("Чайка летает высоко")
    }
}

interface FlyingCreature {
    fun fly()
}

interface FloatingCreature {
    fun swim()
}
