package lesson_18

fun main() {
    val orders: List<Order> =
        listOf(
            OrderSingle(1, "стол"),
            OrderMulti(2, listOf("стул", "ложка", "вилка")),
        )
    orders.forEach { it.getInfo() }
}

open class Order(
    val numberOrder: Int,
) {
    open fun getInfo() {}
}

class OrderSingle(
    numberOrder: Int,
    val product: String,
) : Order(numberOrder) {
    override fun getInfo() {
        println("Заказан товар: $product")
    }
}

class OrderMulti(
    numberOrder: Int,
    val products: List<String>,
) : Order(numberOrder) {
    override fun getInfo() {
        println("Заказан следующие товары : ${products.joinToString(", ")}")
    }
}
