package lesson_22

fun main() {
    val guide = loadData(getContent(), ::parseFromTxt)

    for (data in guide) {
        println(
            """${data.component1()}
            |   Описание: ${data.component2()}
            |   Доступно: ${data.component3() ?: " пока жива Галактика"}
            |   Расстояние от Земли: ${data.component4()}
            """.trimMargin(),
        )
    }
}

data class GalacticGuide(
    val name: String?,
    val description: String?,
    val date: String?,
    val distance: Float?,
)

fun loadData(
    content: String,
    parser: (String) -> MutableList<GalacticGuide>,
): MutableList<GalacticGuide> = parser(content)

fun parseFromTxt(content: String = ""): MutableList<GalacticGuide> {
    val result: MutableList<GalacticGuide> = mutableListOf()
    var data: List<String>

    content.lines().map {
        data = it.split(":")
        if (data.size >= 3) {
            result.add(
                GalacticGuide(
                    name = data[0],
                    description = data[1],
                    date = if (data.size == 4) data[3] else null,
                    distance = data[2].toString().toFloatOrNull(),
                ),
            )
        }
    }

    return result
}

fun getContent(): String =
    """
    Альфа Центавра A: Главная звезда системы, аналогичная нашему Солнцу, с возможностью изучения солнечной активности и астрономических наблюдений.:4.37
    Альфа Центавра B: Вторичная звезда системы, которая также может предложить уникальные условия для исследований.:4.37
    Планета Proxima Centauri b: Экзопланета в зоне обитаемости своей звезды, потенциально подходящая для жизни. Интересно исследовать её атмосферу и возможности колонизации.:4.24
    Планетарный пояс Альфа Центавра: Область, где могут находиться астероиды и кометы, интересные для добычи ресурсов.:4.37
    Космическая станция "Центавр-1": Вымышленная станция для отдыха и обмена информацией между путешественниками.:4.35
    Фестиваль звездных путешествий: Ежегодное событие, собирающее путешественников со всего космоса для обмена опытом и культурой.:4.33:2048-01-01
    Научная конференция "Альфа Центавра": Мероприятие, посвященное исследованиям и открытиям в области астрономии и астрофизики.:4.39:2048-02-01
    Экспедиция по исследованию Proxima Centauri b: Миссия, направленная на изучение условий жизни на экзопланете.:4.24:2048-03-01
    Галактические игры: Соревнования между различными расами и цивилизациями в различных дисциплинах, проходящие на одной из планет системы.:4.37:2048-04-01
    Космический карнаваль: Праздник, посвященный открытиям и достижениям в области космических технологий, с яркими парадами и фейерверками.:4.34:2048-05-01
    """.trimIndent()
