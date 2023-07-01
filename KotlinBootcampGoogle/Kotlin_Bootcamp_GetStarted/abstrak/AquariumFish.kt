package abstrak

object GoldColor: FishColor{
    override val color: String
        get() = "Gold"
}

class FishAction(val food: String) : FishAcrion {
    override fun eat() {
        println(food)
    }
}

class Shark : FishColor , FishAcrion by FishAction("Manusia"){
    override var color: String
        get() = "Blue"
        set(value) {}

//    override fun eat() {
//        println(" Shark = Eat human")
//    }
}

class Nila (fishColor: FishColor = GoldColor) : FishColor by fishColor, FishAcrion by FishAction("litte fish") {
}