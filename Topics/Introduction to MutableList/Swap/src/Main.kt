fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val first = numbers[0]
    val last = numbers[numbers.size - 1]
    numbers[0] = last
    numbers[numbers.size - 1] = first
    println(numbers.joinToString(separator = " "))
}