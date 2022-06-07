fun main(){
    var dateIndex = readLine().toString().split(" ").toMutableList()
    val kaguList = mutableListOf<String>()
    val importantList = mutableListOf<Int>()

    val dateIntList = dateIndex.map {it.toInt()}

    for (i in 0..dateIntList[0]-1){
        val input = readLine().toString().split(" ")

        kaguList.add(input[0])
        importantList.add(input[1].toInt())
    }

    for (i in 0..dateIntList[0]-1){
        if(importantList[i] >= dateIntList[1]){
            println("${kaguList[i]}")
        }
    }
}