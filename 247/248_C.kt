fun main(){
    val dateIndex = readLine()?.toInt() ?:0

    var index = mutableListOf<Moji>(Moji(true,dateIndex))

    while(true){
        var count = 0
        for(i in 0..index.size){
            if(index[i].end == false){
                count++
                continue
            } 
            if(index[i].number-1 <= 1){
                index.add( i , Moji(false,1))
                index.add( i + 2 , Moji(false,1))
                continue
            }else{
                index[i].end = false
                index.add( i , Moji(true,index[i].number-1))
                index.add( i + 2 , Moji(true,index[i+1].number-1))
            }

            println(index)
            println(count)
        }

        if(count == index.size){return}
    }


}

data class Moji (
    var end : Boolean = false,
    var number : Int = 0,
)