fun main(){
    val dateIndex = readLine()
    val dateList = readLine().toString().split(" ")
    val dateIntList = dateList.map { it.toInt() }
    val queryIndex = readLine().toString().toInt()
    val queryList = mutableListOf<MutableList<String>?>()

    for (i in 1..queryIndex){
        queryList.add(readLine().toString().split(" ").toMutableList())
    }
    val queryIntList = queryList.map {it?.map{ it.toInt()}}

    // println(dateIndex)
    // println(dateIntList)
    // println(queryIndex)
    // println(queryIntList)

    for (i in queryIntList){
        var count =0
        for((j,index) in dateIntList.withIndex()){

            if(i != null){
                if( i[0]<=index+1 ){
                    if( i[2] == j){
                        count++
                    }
                }
    
                if( i[1] <= index+1) break
            }
            
        }

        println(count)
    }
}