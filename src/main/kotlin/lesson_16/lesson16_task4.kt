package lesson_16

fun main() {
    val order = Order(1)
    println("Статус заказа ${order.numberOrder}: ${order.getStatus()}")

    updateOrderStatus(order, "Оплачен")

    println("Статус заказа ${order.numberOrder}: ${order.getStatus()}")
}

fun updateOrderStatus(
    order: Order,
    status: String,
) {
    order.setStatus(status)
}

class Order(
    val numberOrder: Int,
) {
    private var status: String = "Новый"

    fun setStatus(status: String) {
        this.status = status
    }

    fun getStatus(): String = status
}
