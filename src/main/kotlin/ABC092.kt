fun main() {
    val N = readLine()!!.toInt()
    val (D, X) = readLine()!!.split(" ").map { it.toInt() }
    var total = N
    for (day in 1..N) {
        val A = readLine()!!.toInt()
        var i = 1
        while (i * A + 1 <= D) {
            total++
            i++
        }
    }
    println(total + X)
}