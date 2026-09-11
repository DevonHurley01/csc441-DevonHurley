package week3wed

fun main() {

    val name: String = "Devon"
    val major = "Computer Science"
    val Favoritefood = "Steak"

    println("---Step 1---")
    println(name)
    println(major)
    println(Favoritefood)

    println("---Step 2---")
    var numCourses = 10
    println(numCourses)
    println("courses now ${numCourses + 1}")

    println("---Step 3---")
    println("${name} is taking CSC-441")
    println("What is your name?")
    val yourName = readlnOrNull()
    println("Nice to meet you ${yourName}")
    println("${yourName} has ${yourName?.length} characters")
    val student = true
    val credits = 3.0
    println("${name} is a student = ${student}")
    println("CSC-441 is ${credits} credits in total")
}