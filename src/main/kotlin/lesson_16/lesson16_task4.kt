package lesson_16

fun main() {
    val order = Order(1)
    println("Статус заказа ${order.numberOrder}: ${order.getStatus()}")

    order.updateOrderStatus("Оплачен")

    println("Статус заказа ${order.numberOrder}: ${order.getStatus()}")
}

class Order(
    val numberOrder: Int,
) {
    private var status: String = "Новый"

    private fun setStatus(status: String) {
        this.status = status
    }

    fun updateOrderStatus(status: String) {
        setStatus(status)
    }

    fun getStatus(): String = status
}
