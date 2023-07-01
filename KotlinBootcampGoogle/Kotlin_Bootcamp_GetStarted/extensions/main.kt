package extensions

fun ngapain(isi: String) : Boolean{
    if(isi.startsWith("S")){
        return true
    }
    return false
}

fun String.hasSpace () : Boolean {
    val found = this.find { it == ' '}
    return found != null
}

fun main(){
    val data = mutableListOf<String>("Senin", "Selasa", "Rabu")
    val dataCopy = data.asReversed()
    val data2 = hashMapOf<String, String>("Ucup" to "Panca", "Udin" to "Panci")
    val mutableHashMap = mutableMapOf<String, Int>("First" to 1)

    val hasilPartition = data.partition { ngapain(it) }

    println(hasilPartition.toString())

    println(hasilPartition.first)
    println(hasilPartition.second)
    val number = Triple(1,2,3)

    val (number1 ,number2, number3) = number

    println(number2)
    println(number.third)

    for (i in data.listIterator()){
        println("$i")
    }

    mutableHashMap.put("Second", 2)
    println(mutableHashMap.getOrElse("second") {"hasil null"})
    println(mutableHashMap.toString())

    println(data2.get("Ucup"))
    println(data2["Ucup"])

    println(Constant.API)
    println(dataCopy.toString())


}