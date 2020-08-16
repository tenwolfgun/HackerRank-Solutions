fun main() {
    val a = arrayOf(17, 28, 30)
    val b = arrayOf(99, 16, 8)

    val result = test(a, b)

    println(result.map { it })

}

fun test(a: Array<Int>, b: Array<Int>): Array<Int> {
    val result: Array<Int> = arrayOf(0, 0)

    for (i in a.indices) {
        when {
            a[i] > b[i] -> result[0] += 1
            b[i] > a[i] -> result[1] += 1
        }
    }

    return result
}