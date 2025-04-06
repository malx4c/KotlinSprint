package lesson_10.task_2

import lesson_9.YES_WORD
/*
Задача 4 к Уроку 10

Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее число.
Теперь дай возможность пользователю играть до тех пор пока ему не надоест. В конце программа должна вывести сколько партий он выиграл.

- после первого раунда программа задает вопрос: “Хотите бросить кости еще раз? Введите Да или Нет”;
- программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества выигрышных партий человека;
- в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
- основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.
*/
fun main() {
    var counterWin = 0

    while (getUserInput().equals(YES_WORD,true)) {
        if (getRoundResult()) counterWin++
    }

    println("Игра окончена. Вы выйграли $counterWin раз")
}

fun getUserInput(): String {
    print("Хотите бросить кости еще раз? Введите Да или Нет: ")

    return readln()
}

fun getRoundResult(): Boolean {
    val playerMove = getRandomNumber()
    val botMove = getRandomNumber()
    showResult(playerMove, botMove)

    return playerMove > botMove
}

fun getRandomNumber(): Int {
    return (1..6).random()
}

fun showResult (playerMove: Int, botMove: Int,  ) {
    println("Игроку выпало $playerMove")
    println("Боту выпало $botMove")

    val result = when (true) {
        (playerMove > botMove) -> "Победило человечество"
        (playerMove < botMove) -> "Победила машина"
        else -> "Победила дружба"
    }
    println(result)
}
