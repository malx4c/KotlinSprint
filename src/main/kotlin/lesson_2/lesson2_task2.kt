package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryEmployee = 30000
    val salaryIntern = 20000

    val costEmployees = numberOfEmployees * salaryEmployee
    val costTotal = costEmployees + numberOfInterns * salaryIntern
    val costAverage = costTotal / (numberOfEmployees + numberOfInterns)

    println(String.format("Расходы на выплату зарплаты постоянных сотрудников: %d", costEmployees))
    println(String.format("Общие расходы по ЗП после прихода стажеров: %d", costTotal))
    println(String.format("Среднюю ЗП одного сотрудника после устройства стажеров: %d", costAverage))
}