import kotlin.text.toIntOrNull

fun main(){
    val dateIndex = readLine()?.toIntOrNull() ?:0

    val queryList = mutableListOf<MutableList<String>>()

    
    for(i in 1..dateIndex){
        val dateList = readLine().toString().split(" ")
        queryList.add(dateList.toMutableList())
    }

    //println(queryList)

    for (i in 0 .. queryList.size){
        for (j in 0 .. 1){
            for (k in 0 .. queryList.size){
                for (l in 0 .. 1){
                    if(queryList[i][j] == queryList[k][l]){
                        println("No")
                        return 
                    }
                }
            }
        }
    }

    println("Yes")

    return
}