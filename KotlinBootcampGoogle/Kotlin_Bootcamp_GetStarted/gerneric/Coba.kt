package gerneric

class Coba {
    fun getYear(year: String) : Int = year.first().digitToInt()
}

fun maps(x: IntArray): IntArray {
    val data = IntArray(x.size  )
    var i = -1
    for (a in x){
        i++
        data[i] = a*2
    }
    return data
}
fun main(){
    println(maps(intArrayOf(1,2,3)).to)
}