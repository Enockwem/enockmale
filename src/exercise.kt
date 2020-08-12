
fun main(){
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