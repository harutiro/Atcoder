fun main(){
    var dateIndex = readLine().toString().split(" ").toMutableList()
    var colorIndex = readLine().toString().split(" ").toMutableList()
    val importList = mutableListOf<MutableList<Int>?>()

    val dateIntList = dateIndex.map {it.toInt()}

    for (i in 0..dateIntList[1]-1){
        val input = readLine().toString().split(" ").toMutableList()
        val inputIntList = input.map {it.toInt()}.toMutableList()
        
        importList.add(inputIntList)
    }

    for (i in importList){
        for (j in i){
            if (j == 1){
                
            }
        }
    }


}