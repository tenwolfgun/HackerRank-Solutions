import kotlin.math.abs
import kotlin.math.absoluteValue

fun main() {
    val a = arrayOf(
        arrayOf(11, 2, 4),
        arrayOf(4, 5, 6),
        arrayOf(10, 8, -12)
    )

    println(test(a))
}

fun test(a: Array<Array<Int>>): Int {
    var r1 = 0
    var r2 = 0

    for (i in 0 until a.size) {
        r1 += a[i][a.size - i - 1]
        r2 += a[i][i]
    }

    return abs(r2 - r1)
}