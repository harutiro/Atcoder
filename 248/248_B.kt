fun main(){
    var inputDate = readLine().toString().split(' ').toMutableList()
    var count = 0

    while(inputDate[0].toInt()<inputDate[1].toInt()){
        inputDate[0] = (inputDate[0].toInt() * inputDate[2].toInt()).toString()
        count++

        //大きすぎて、数がひっくり返ることがある。　要注意
        if(inputDate[0].toInt() < 0) break
    }

    println(count)

}