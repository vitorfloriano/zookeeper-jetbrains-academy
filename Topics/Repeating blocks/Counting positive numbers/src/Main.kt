fun main() {
    val sequence = readln().toInt()
    var count = 0
    repeat(sequence) {
        val number = readln().toInt()
        if (number > 0) {
            count++
        }
    }
    println(count)
}