package lesson_22

fun main() {
    MainScreenViewModel()
}

class MainScreenViewModel(
    var mainScreenState: MainScreenState = MainScreenState(),
) {
    init {
        loadData()
    }

    fun loadData() {
        mainScreenState = MainScreenState()
        printStatus(State.NO_DATA)

        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(isLoading = true)
        printStatus(State.LOADING)

        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(isLoading = false)
        printStatus(State.AVAILABLE_DATA)
    }

    fun printStatus(state: State) {
        println("Статус: ${state.description} , идет загрузка: ${mainScreenState.isLoading}")
    }

    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false,
    )
}

enum class State(
    val description: String,
) {
    NO_DATA("отсутствие данных"),
    LOADING("загрузка данных"),
    AVAILABLE_DATA("наличие загруженных данных"),
}
