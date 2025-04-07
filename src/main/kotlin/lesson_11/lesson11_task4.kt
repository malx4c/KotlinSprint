package lesson_11

class RecipeCategoty (
    val name: String,
    val image: String,
    val description: String
){}

class Recipe (
    val name: String,
    val inngredients: MutableList<Ingredient> = mutableListOf(),
    val instructions: String,
    val isFavorit: Boolean = false
) {}

class Ingredient (
    val name: String,
    val weight: Float,
    val count: Int
){}

