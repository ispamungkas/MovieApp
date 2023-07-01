import java.util.Random

fun randomDay() : String {
    val day = listOf<String>("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")
    return day[Random().nextInt(day.size)]
}

fun makanan (day: String) : String{
    val data : String?
    when (day) {
        "Senin" -> data = "Bakso"
        "Selasa" -> data = "Mie ayam"
        "Rabu" -> data = "ga makan"
        "Kamis" -> data = "soto"
        "Jum'at" -> data = "cakwe"
        "Sabtu" -> data = "aci"
        "Minggu" -> data = "kambing"
        else -> data = "data tidak ada"
    }
    return data
}

fun updateDirty (number : Int, callback : (Int) -> Int) : Int {
    return callback(number)
}

fun increment (start : Int) = start + 1
fun main(args : Array<String>) {
    val day = listOf<String>("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")

    val randomDay = randomDay()
    val makan = makanan(randomDay)

    val filter = day.asSequence().filter { it.contains('s')}.map {
        it
    }

    val callback : (Int) -> Int = { dirty -> dirty/2 }
    println(updateDirty(20, ::increment))
    println(updateDirty(20) {
        dirty-> dirty/2
    })

    println("--")
    println(filter.first())
    println("--------------")
    println(filter.toList())

    println("hari ini makan $makan")
}