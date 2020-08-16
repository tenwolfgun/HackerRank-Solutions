fun main() {

    val ar: Array<Int> = arrayOf(3, 2, 1, 3)

    println(birthdayCakeCandles(ar))

}

fun birthdayCakeCandles(ar: Array<Int>): Int {
    val max: Int? = ar.max()
    var result = 0

    for (i in ar.indices) {
        if (ar[i] == max) result += 1
    }

    return result
}