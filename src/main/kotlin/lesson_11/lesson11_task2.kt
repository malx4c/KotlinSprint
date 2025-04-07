package lesson_11.task2

fun main() {

    val user1 = User2 (
        id = 1,
        login = "u1login",
        pass = "u1pass",
        email = "user1@user.xyz"
    )

    user1.setBio()
    user1.setPass()
    user1.printInfo()

}

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val email: String,
    var bio: String = "",
) {

    fun printInfo() {
        println("id: $id")
        println("login: $login")
        println("pass: $pass")
        println("email: $email")
        println("bio: $bio")
    }

    fun setBio() {
        print("Расскажите о себе:")
        bio = readln()
    }

    fun setPass() {

        print("Введите текущий пароль:")
        if(readln() == pass) {
            print("Введите новый пароль:")
            pass = readln()
            println("Пароль изменен успешно")
        } else {
            println("Пароль не верный.")
        }
    }
}


