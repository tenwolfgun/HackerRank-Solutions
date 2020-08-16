fun main() {

    val a: Array<Int> = arrayOf(-4, 3, -9, 0, 4, 1)

    test(a)

}

fun test(arr: Array<Int>): Unit {
    var positive: Int = 0
    var negative: Int = 0
    var zero: Int = 0

    for (i in arr.indices) {
        when {
            arr[i] > 0 -> positive += 1
            arr[i] < 0 -> negative += 1
            else -> zero += 1
        }
    }

    println((positive.toDouble() / arr.size))
    println(negative.toDouble() / arr.size)
    println(zero.toDouble() / arr.size)
}