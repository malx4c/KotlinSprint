package lesson_11.task3

fun main() {
    val member1 = Member (
        id = 1,
        name = "user1",
        avatar = "image1.png"
    )
    val member2 = Member (
        id = 2,
        name = "user2",
        avatar = "image2.png"
    )
    val member3 = Member (
        id = 3,
        name = "user3",
        avatar = "image3.png"
    )
    val room1 = ChartRoom(
        id = 1,
        name = "first chart room",
        cover = "Cover First Room",
    )

    room1.addMember(member1)
    room1.addMember(member2)
    room1.addMember(member3)

    room1.setStatusMember(member1.name, STATUS_MIC_OFF)
    room1.setStatusMember(member2.name, STATUS_SPEAKS)
    room1.setStatusMember(member3.name, STATSU_MUTE)

    println("Комната ${room1.name}, участников: ${room1.members.size}")
    println("member1 стутус: ${member1.status}")
    println("member2 стутус: ${member2.status}")
    println("member3 стутус: ${member3.status}")
}

class ChartRoom (
    val id: Int,
    val name: String,
    val cover: String,
    var members: MutableList<Member> = mutableListOf()
) {

    fun addMember(member: Member) {
        members.add(member)
    }

    fun setStatusMember(name: String, status: String) {
        val member = members.find { it.name == name }
        if (member != null) member.status = status
    }
}

class Member (
    val id: Int,
    val name: String,
    val avatar: String,
    var status: String = "",
){

}

const val STATUS_SPEAKS = "разговаривает"
const val STATUS_MIC_OFF = "микрофон выключен"
const val STATSU_MUTE = "пользователь заглушен"
