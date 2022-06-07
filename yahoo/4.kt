fun main(){
    var inputDate = readLine().toString().split(" ").toMutableList()
    var day = 0L
    var point = 0L
    val dateIntList = inputDate.map {it.toLong()}


    while(dateIntList[2] > point){

        point += dateIntList[0]

        for (i in day.toString().toCharArray()){
            if(i == '7'){
                point += dateIntList[1]
                break
            }
        }

        day++
        //println(point)

    }

    println(day - 1)

}