package lesson_10.task_2
/*
Задача 5* к Уроку 10
Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.
Метод авторизации принимает логин и пароль, верифицирует пользователя. Креды (credentials) для входа сохрани в константы.
При успешной авторизации – метод генерирует и возвращает токен доступа.
Токен - текстовая строка,
генерируемая методом авторизации (32 символа, которые включают цифры и буквы англ. алфавита – специальные библиотеки использовать не нужно).
Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token
При неудачной авторизации метод возвращает null.
Метод получения корзины должен принимать токен и возвращать список товаров (содержимое переменной корзины, произвольный тип данных).
Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
Переменные логин и пароль для корректной авторизации проинициализированы заранее и неизменяемы.

*
*/
fun main() {
    val login  = "login"
    val pass = "pass"
    val accessToken = getAuth(login, pass)

    if (accessToken != null)
        println (getCart(accessToken))
    else
        println ("Ошибка авторизации.")
}

fun getAuth(login: String, pass: String): String? {
    if (login == LOGIN && pass == PASSWORD)
        return getAccessToken()
    else
       return null
}

fun getCart(token: String): List<String> {
    return listOf("хлеб","молоко","соль")
}

fun getAccessToken(): String {
    val tokenAllChars = TOKEN_UPPER_CHARS + TOKEN_LOWER_CHARS + TOKEN_NUMBERS
    var token = ""

    for (i in 1 .. TOKEN_LENGTH)
        token += tokenAllChars.random()

    return token
}

const val LOGIN = "login"
const val PASSWORD = "pass"
const val TOKEN_LENGTH = 32
val TOKEN_UPPER_CHARS = 'A'..'Z'
val TOKEN_LOWER_CHARS = 'a'..'z'
val TOKEN_NUMBERS = 0..9