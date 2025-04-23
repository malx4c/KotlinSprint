package lesson_19

fun main() {
    val products: List<Product> =
        listOf(
            Product(1, "рубашка", CategoryOfProduct.CLOTHING),
            Product(2, "ручка", CategoryOfProduct.STATIONERY),
            Product(3, "молоток", CategoryOfProduct.OTHER),
        )
    products.forEach { it.getInfo() }
}

class Product(
    val id: Int,
    val name: String,
    val category: CategoryOfProduct,
) {
    fun getInfo() {
        println("Товар: $name\n\tid: $id\n\tКатегория: ${category.getNameCategory(category)}")
    }
}

enum class CategoryOfProduct {
    CLOTHING,
    STATIONERY,
    OTHER,
    ;

    fun getNameCategory(category: CategoryOfProduct): String =
        when (category) {
            CLOTHING -> "одежда"
            STATIONERY -> "канцелярские товары"
            else -> "разное"
        }
}
