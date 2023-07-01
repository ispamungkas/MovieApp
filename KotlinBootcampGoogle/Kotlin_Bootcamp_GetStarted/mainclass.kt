import class_place.Aquarium
import class_place.TowerTank

fun buildAqua() {
    val instanceAqua = Aquarium(long = 25, width = 25, height = 40)
    instanceAqua.printSize()

    val towertank = TowerTank(40, 25)
    towertank.printSize()
//    println("Volume ${instanceAqua.width * instanceAqua.long * instanceAqua.height / 1000} L")
//    instanceAqua.volume = 100
//    instanceAqua.printSize()

//    val instanceAqua1 = Aquarium(10, 10)
//    instanceAqua1.printSize()
//
//    val instanceAqua2 = Aquarium(10,5, 20)
//    instanceAqua2.printSize()

}

fun main(args : Array<String>) {
    buildAqua()
}