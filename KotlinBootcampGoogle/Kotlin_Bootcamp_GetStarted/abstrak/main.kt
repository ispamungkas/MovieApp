package abstrak

fun callFish(){
    val shark = Shark()
    val nila = Nila()

    println("Shark is ${shark.color}, and nila is ${nila.color}")
    shark.eat()
    nila.eat()
}

fun main (args: Array<String>){
   callFish()
}