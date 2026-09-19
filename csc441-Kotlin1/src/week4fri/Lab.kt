package week4fri

fun main() {
    println("--- Step 1: Two names ---")
    val firstName: String = "Devon"
    val lastName: String? = null
//  val lastName: String? = "Hurley"

    println(firstName.length)
//    println(lastName.length)

    println("--- Step 2: Safe Call ---")
    println(lastName?.length)

    println("--- Step 3: Elvis operator ---")
    println(lastName?.length ?: 0)

    println("--- Step 4: Let ---")
    lastName?.let {
        println("Last name is: $it ")
    }

    println("--- Step 5: toIntOrNull() ---")
    val notANumber = "Swimming".toIntOrNull()
    println(notANumber ?: "This was not a number")

    println("--- Step 6: aListOf() ---")
    val cars = listOf("Ford", "Chevy", "Ram", "Toyota")
    println(cars)

    println("--- Step 7: mutableListOf() ---")
    val snowyActivities = mutableListOf("SnowBoard", "Ski", "SnowMobile")
    snowyActivities.add("Snowball Fight")
    snowyActivities.remove("SnowBoard")
    println(snowyActivities)
    println(snowyActivities.size)

    println("--- Step 8: A List of Numbers ---")
    val points = listOf(1, 6, 3, 9, 5)
    println("Sum: ${points.sum()}")
    println("Average: ${points.average()}")
    println("Filter: ${points.filter { it >= 5 }}")

}