import kotlin.text.toIntOrNull

fun main(){
    val dateIndex = readLine()?.toIntOrNull() ?:0

    val queryList = mutableListOf<MutableList<String>>()

    
    for(i in 1..dateIndex){
        val dateList = readLine().toString().split(" ")
        queryList.add(dateList.toMutableList())
    }

    //println(queryList)

    for (i in 0 .. dateIndex){
        for (s in queryList){
            for(c in 0..1){
                for (j in 0..dateIndex){
                    if(i != j) continue

                    
                    
                }
            }
        }
    }

    println("Yes")

    return
}