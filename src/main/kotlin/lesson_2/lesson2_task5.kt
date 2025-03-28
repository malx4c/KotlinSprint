package org.example.lesson_2

fun main() {
/*
 A = P × (1 + r/n)ⁿᵗ
Где:
•  A  — итоговая сумма (будущая стоимость)
•  P  — начальная сумма (капитал)
•  r  — годовая процентная ставка (в десятичном виде)
•  n  — количество начислений процентов в год
•  t  — количество лет
 */

    val startSum = 70000.0
    val annualInterestRate = 16.7
    val depositPeriod = 20

    val finishSum = startSum * Math.pow(1 + annualInterestRate / 100 ,depositPeriod.toDouble())

    print(String.format("%.3f", finishSum))
}