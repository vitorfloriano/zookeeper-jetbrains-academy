fun main() {

    val a = readln()!!.toInt()
    val b = readln()!!.toInt()

    val max = if (a > b) a else b
    println(max)
}