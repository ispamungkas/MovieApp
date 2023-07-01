package extensions

open class Aquarium(val color : String, size: Int) {
    val Aquarium.isGreen : Boolean
        get() = color == "Green"
}

class GreenAquarium(size: Int) : Aquarium("Green", size){}

fun Aquarium.print() : String = println("is Green ${isGreen}").toString()
fun GreenAquarium.print() : String = println("This is GreenAquarium").toString()

fun Aquarium?.pull() {
    this?.apply {
        println("apaan si masukin null")
    }
}

fun main() {
    val data = Aquarium("Green", 29)
    data.print()

    println("-------------------")
    val data2: Aquarium? = null
    data.pull()
}