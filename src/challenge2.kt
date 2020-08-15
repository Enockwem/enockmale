import java.io.File
import java.io.FileWriter

fun main(){
    var count: Int = 0
    var count_comment:Int = 0
    val filename = "src/files/wiki-100k.txt"
    val resultFile = "src/files/result.txt"
    val myFile = FileWriter(resultFile,true)
    var checkFili= File(filename)
    if (File(filename).exists()){
        checkFili.forEachLine {
            if (it.startsWith('#'))
                count_comment++
            else{
                count++
            }
        }
    }else{
        println("! Sorry it doesn't exist")
    }

    myFile.write("$count COMMON ENGLISH WORDS")
    checkFili.forEachLine {
        if (it.startsWith('#'))
            it.toString()
        else{
            myFile.write(it.toLowerCase()+"\n")
        }
    }
    myFile.close()

}
