fun main() {
    val a: Array<Long> = arrayOf(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)

    val result = test(a)

    println(result)

}

fun test(a: Array<Long>): Long {
    return a.sum()
}