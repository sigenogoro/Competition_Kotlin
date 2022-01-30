import kotlin.math.max

// abc160_c
fun main() {
    val (K, N) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    A.add(K + A[0])
    var diffMax = 0
    for (i in 0 until N) {
        diffMax = max(diffMax, A[i + 1] - A[i])
    }
    println(K - diffMax)
}
//　ABC074 B
//val N = readLine()!!.toInt()
//val K = readLine()!!.toInt()
//val x = readLine()!!.split(" ").map { it.toInt() }
//
//var sum = 0
//
//for(i in 0 until N){
//    val roboA = 2 * x[i]
//    val roboB = 2 * (K - x[i])
//    sum += min(roboA, roboB)
//}
//
//println(sum)