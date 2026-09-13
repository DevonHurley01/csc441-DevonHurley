package week3fri

fun main(){
    for(i in 1..10){
        print("$i ")
    }
    println()
    for(i in 20 downTo 1 step 3){
        print("$i ")
    }
    println()
    val packingList = mutableListOf("Toothbrush", "Clothes", "Passport", "Hat")

    for (item in packingList){
        println(item)
    }
    println()
    packingList.forEachIndexed { index, item ->
        println("$index is $item")
    }
    println()
    for (i in 0 until packingList.size){
        println("$i : ${packingList[i]}")
    }
    val day: String = "3"
    when(day){
        "1" -> println("Monday")
        "2" -> println("Tuesday")
        "3" -> println("Wednesday")
        "4" -> println("Thursday")
        "5" -> println("Friday")
        "6" -> println("Saturday")
        "7" -> println("Sunday")
    }

    val budget = 100
    val price = if (budget < 100) "Under Budget" else "Over Budget"
    println(price)
}