package lesson_11

class RecipeCategoty(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val recipe: List<Recipe> = listOf()
)

class Recipe(
    val name: String,
    val inngredients: List<Ingredient> = listOf(),
    val instructions: String,
    val imageUrl: String,
    val isFavorit: Boolean = false
)

class Ingredient(
    val name: String,
    val weight: Float,
    val count: Int
)

