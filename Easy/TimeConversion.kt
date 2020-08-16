fun main() {

    val time = "12:05:45AM"
    val newTime = "01:05:45PM"
    val newAmTime = "11:05:45AM"

    println(timeConversion(newTime))

}

fun timeConversion(s: String): String {
    val result: String = s.slice(0..7)

    val time: String = s.slice(0..1)
    val format: String = s.slice(8..9)

    return when {
        time == "12" && format == "AM" -> result.replace(time, "00", true)
        time < "12" && format == "PM" -> result.replace(time, (time.toInt() + 12).toString())
        else -> result
    }
}