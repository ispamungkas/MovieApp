package class_place

import kotlin.math.PI

abstract class ucup(){
    abstract val data: String
    abstract fun po(data: String)
}


open class Aquarium (open var height : Int = 10, open var width : Int = 20, open var long : Int = 50) : ucup() {

    override val data: String = "Cuaks"

    override fun po(data: String) {
        println("ini ada po yang isinya $data")
    }

    init {
        println("Aquarium is initializing")
    }

    open var volume : Int
        get() = long * width * height / 1000
        set(value) {
            height = (value * 1000)/ (width*long)
        }

    open val shape = "Rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    constructor(numberOfFish : Int) : this() {
        val tank  = numberOfFish * 2000 * 1.1
        height = (tank/ (long * width)).toInt()
    }

    fun printSize() {
        println("This aquarium length is $long" +
                "height is $height" +
                "width is $width")
        println("Volume : $volume L and water $water in $shape")
    }

}

class TowerTank (override var height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, long = diameter) {
    override var volume: Int
        get() = (width/2 * long/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000/ PI) / (width/2 * long/2)).toInt()
        }

    override var water: Double = volume * 0.8

    override var shape: String = "cylinder"
}

fun main(){
    val aqua = Aquarium()
    aqua.po("Ocom")
}