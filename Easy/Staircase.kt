fun main() {

    test(6)

}

fun test(n: Int): Unit {
    for (i in 0 until n) {
        println("#".repeat(i + 1).padStart(n, ' '))
    }
}