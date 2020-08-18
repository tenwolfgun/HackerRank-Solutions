fun main() {

    val grades: Array<Int> = arrayOf(4, 73, 67, 38, 33)

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))

}


fun gradingStudents(grades: Array<Int>): Array<Int> {
    val copyGrades = grades.drop(1).toMutableList()
    for (i in copyGrades.indices) {
        if (copyGrades[i] >= 38) {
            if (copyGrades[i] % 5 > 2) {
                copyGrades[i] += 5 - (copyGrades[i] % 5)
            }
        }
    }
    return copyGrades.toTypedArray()
}

