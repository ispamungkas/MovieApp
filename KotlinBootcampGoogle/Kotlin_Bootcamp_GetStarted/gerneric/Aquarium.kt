package gerneric


fun genericExample (){
    val aquarium = Aquarium(TapWater())
    println("Water processing is : ${aquarium.a.needsProcessing}")
    aquarium.a.addChemicalCleaners()
    println("Water processing is : ${aquarium.a.needsProcessing}")

    val aquarium2 = Aquarium(TapWater())
    aquarium2.a.addChemicalCleaners()
    aquarium2.addWater()

    addItemTo(aquarium2)

    val cleaner = TapCleaner()
    aquarium2.cleaner(cleaner)
    println(aquarium2.a.needsProcessing)

    isWaterClean(aquarium)
    println(aquarium2.hasWaterSupply<TapWater>())

}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")

fun <T : WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("Aquarium water is : ${!aquarium.a.needsProcessing}")
}

fun main(){
    genericExample()
}

class Aquarium <out T : WaterSupply> (val a: T){
    fun cleaner(cleaner : Cleaner<T>){
        if(a.needsProcessing){
            cleaner.clean(a)
            cleaner.printdata(a)
        } else {
            println("Water added")
        }
    }
    fun addWater(){
        check(!a.needsProcessing) {"need processing first"}
        println("Done add water")
    }

    inline fun<reified R : WaterSupply> hasWaterSupply () = a is R
}

interface Cleaner<in T : WaterSupply>{
    fun clean(waterSupply: T)
    fun printdata(waterSupply: T)
}

class TapCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
    override fun printdata(waterSupply: TapWater) = println("cuaks")
}

open class WaterSupply (var needsProcessing: Boolean){} // Top hearaki

class TapWater : WaterSupply(true){ // Turunan 1
    fun addChemicalCleaners(){
            needsProcessing = false
    }
    fun cobaprint(){
        println("ini lendmark")
    }
}

class FishStoreWater : WaterSupply(false) //Turunna 2
class LakeWater : WaterSupply(true){ // Turunan 3
    fun filter () {
        needsProcessing = false
    }
}


