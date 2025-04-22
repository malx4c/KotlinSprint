package lesson_18

fun main() {
    val order = Order(1)
    order.addProduct("стол")

    val order2 = Order(2)
    order2.addProduct(listOf("стул", "ложка", "вилка"))
}

open class Order(
    val numberOrder: Int,
) {
    fun addProduct(product: String) {
        println("Заказ N $numberOrder содержит <$product>")
    }

    fun addProduct(products: List<String>) {
        println("Заказ N $numberOrder содержит <${products.joinToString(", ")}>")
    }
}
