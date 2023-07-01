package dataclass

data class Decoration(var rorks: String, var wood: String, var diver: String) {
}


enum class Direction(val degress: Int){
    NORTH(0),
    SOUTH(1),
    EAST(90);
}

fun matchSeal(seal : Seal): String {
    return when(seal){
        is Seal.SeaLion -> "ini Sealion"
    }
}


fun main(){
    val decor = Decoration("Another", "woodls", "diver")
    println(decor)

    val (rooks, wood, fiver) = decor
    println(rooks)
    println(wood)
    println(fiver)

    println(Direction.EAST.ordinal)
    println(Direction.EAST.declaringJavaClass)
    println(Direction.EAST.degress)

}