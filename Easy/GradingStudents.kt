fun main() {

    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))

}


fun gradingStudents(grades: Array<Int>): Array<Int> {
    val copyGrades = grades.drop(0).toMutableList()
    for (i in copyGrades.indices) {
        if (copyGrades[i] >= 38) {
            if (copyGrades[i] % 5 > 2) {
                copyGrades[i] += 5 - (copyGrades[i] % 5)
            }
        }
    }
    return copyGrades.toTypedArray()
}

