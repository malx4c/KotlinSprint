package lesson_19

fun main() {
    println("Список рыб:")
    for (fish in Fish.entries) println(fish.getName())
}

enum class Fish {
    GUPPY {
        override fun getName() = "Гуппи"
    },
    ANGEL_FISH {
        override fun getName() = "Скалярия"
    },
    GOLD_FISH {
        override fun getName() = "Золотая рыбка"
    },
    SIAMESE_FIGHTING_FISH {
        override fun getName() = "Петушок"
    }, ;

    abstract fun getName(): String
}
