fun main() {
    val numbers = mutableListOf(100) { 0 }
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100
    // do not touch the lines below
    println(numbers.joinToString())
}