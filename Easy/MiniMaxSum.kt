import kotlin.math.absoluteValue

fun main() {

    val a: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val b: Array<Int> = arrayOf(7, 69, 2, 221, 8974)
    val c: Array<Int> = arrayOf(140638725, 436257910, 953274816, 734065819, 362748590)
    miniMaxSum(c)

}

fun miniMaxSum(arr: Array<Int>): Unit {

    arr.sort()
    val temp: MutableList<Long> = mutableListOf()

    arr.forEach { temp.add(it.toLong()) }

    val a: Long = temp.slice(0..3).sum()
    val b: Long = temp.slice(1..4).sum()
    val result = arrayOf(a, b)
    println(result.joinToString(separator = " "))
}

