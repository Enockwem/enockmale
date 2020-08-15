
fun main(){

    val numbersMap = mapOf("key1" to 1, "key2" to 2,"key3" to 3,"key4" to 1)
    println("all keys: ${numbersMap.keys}")
    println("all values: ${numbersMap.values}")
    if("key2" in numbersMap) println("Value by key")
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot");
    val eager = decorations.filter { it[0] == 'p' }
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("eager: $eager")
    println("lazy: $lazyMap")
    println("--------")
    println("first: ${lazyMap.first()}")
    println("--------")
    println("all: ${lazyMap.toList()}")
    println("----------Printing Numbers----------")
}