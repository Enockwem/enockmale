//Think of the whole line one at a time
//NOTE: How you think of data is important
fun generateNumbers(){
    val max = 154
    var i = 1
    while (i < max){
        println("$i-${i +1},${i+4}-${i+5},${i+8}-${i+9}")
        i += 12
    }
}

fun main(){
    generateNumbers()
}