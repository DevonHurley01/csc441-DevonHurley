package week4wed

fun main(){
    println("---Step 1---")
    describeToday()

    println("---Step 2---")
    println(favoriteThing())

    println("---Step 3---")
    println(pickOne(number = 2))

    println("---Step 4---")
    println(pickOneShort(number = 3))

    println("---Step 5---")
    println(pickWithDefault())
    println(pickWithDefault(name = "Devon"))
}
fun describeToday(){
    println("Today is partly cloud and high of 74 degrees")
}
fun favoriteThing(): String {
    return "My favorite pet are dogs"
}
fun pickOne(number: Int): String{
    return when(number){
        1 -> "Christmas"
        2 -> "Halloween"
        3 -> "Thanksgiving"
        else -> "Don't have a favorite"
    }
}
fun pickOneShort(number: Int): String = when(number){
        1 -> "Christmas"
        2 -> "Halloween"
        3 -> "Thanksgiving"
        else -> "Don't have a favorite"
}
fun pickWithDefault(number: Int = 1, name: String = "your"): String{
    val holiday = when(number) {
        1 -> "Christmas"
        2 -> "Halloween"
        3 -> "Thanksgiving"
        else -> "Don't have a favorite"
    }
    return "$name favorite holiday is $holiday"
}