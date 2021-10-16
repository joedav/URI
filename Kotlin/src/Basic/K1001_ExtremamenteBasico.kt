package Basic

fun main(args: Array<String>) {
    var a: Int
    var b: Int

    a = readLine()?.toInt() ?: 0
    b = readLine()?.toInt() ?: 0

    val result = basicSum(a, b)
    println("X = $result")


}
fun basicSum(n1: Int, n2: Int) = n1 + n2

