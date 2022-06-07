fun main(){
    var dateIndex = readLine()
    val dateList = readLine().toString().split(" ")

    val queryIntList = dateList.map {it.toInt()}

    dateIndex += dateIndex

    val newDate = queryIntList.sorted()
    val oldDate = queryIntList.sorted().reversed()


    println( "${newDate[0]} ${oldDate[0]}")

    for(i in newDate){
        println(i)
    }
    println()
}