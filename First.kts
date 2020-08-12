import kotlin.random.Random

val numberOfFish = 50
val numberOfPlants = 23
//using the if/else statemet in kotlin
if(numberOfFish > numberOfPlants){
    println("Good ratio!")
}else{
    println("Unhealthy ratio")
}
//checking if in range in kotlin
val fish = 50
if(fish in 1..100){
    println(fish)
}
//using the when statement in kotlin which is like the 'switch statement' in other programmint languages
//The when statement is the kotlin's version of a switch statement

when(numberOfFish){
    0 -> println("Got no fish")
    10 ->println("I have $numberOfFish")
    in 10..39 -> println("Got some fish")
    else -> println("Got enough and too much fish")
}
//Declaring null values in kotlin
var marbles: Int? = null
var fishFoodThreats = 6
if(fishFoodThreats != null){
    fishFoodThreats = fishFoodThreats.dec()
}else{
    println("The value is null")
}
//Learning about the ? and ?: operators
var v: Int? = null
fishFoodThreats = fishFoodThreats.dec()

//Creating lists
val school = listOf("mackerel","trout","halibut")
println(school)
val fschool = arrayOf("shark","salmon","minnow")
println(java.util.Arrays.toString(fschool))

//arrays with + operators
val numbers = intArrayOf(1, 2, 3)
val oceans = listOf("Atlantic", "Pacific","Nakayiza","Loves","Enock","One")
val notPrintingtheIntArrayof = listOf(numbers,oceans,"Ketty")
val oddList = listOf(numbers.asList(), oceans, "salmon")
println(oddList)
//creating the arrays with size
val array = Array(5){it * 2}
println(java.util.Arrays.toString(array))

//Making loops
for(element in school){
    print(element + " ")
}
//looping through with indexes
for((index,element) in school.withIndex()){
    println("Name at $index is $element\n")
}
for(i in 1..10)println(i)
for(i in 5 downTo 0) println(i)
for(i in 0..11 step 2) println(i)
for(i in 'd'..'l')println(i)

//Trying out other loops just like in other programming languages
//while loop
var bubble = 0
while(bubble < 50){
    println("$bubble: Enock is in Love with Kotlin")
    bubble++
}
//do while
//var y = 100
//do {
//    y--
//}while (y > 50)println("$y")

//repeat loop
repeat(10){
    print("Ketty")
}

// Dealing with functions in kotlin programming
import java.util.* // required import
fun feedTheFish(){
    val day = randomDay()
    val food = "pelletes"
    println("Today is $day and the fish eat $food")
}
fun main(args: Array<>){
    feedTheFish()
}

fun randomDay(): String{
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String{
    val food = ""
    when(day){
        "Monday" -> food = "Enock"
        "Tuesday" -> food = "Male"
        "Wednesday" -> food = "Wasswa"
        "Thursday" -> food = "Kyabasinga"
        "Friday" -> food = "Emile"
        "Saturday" -> food = "Kayongo"
        "Sunday" -> food = "Emi"
    }
    return food
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}
println(shouldChangeWater("Sunday",30,30))