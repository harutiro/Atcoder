import java.util.BitSet

fun bitFullSearch(n: Int): List<BitSet> = (0 until (1 shl n)).map { bit ->
    BitSet(n).apply {
        repeat(n) { i ->
            set(i, bit and (1 shl i) > 0)
        }
    }
}


fun main(){
    //最初の行の取得
    var inputNumber = readLine().toString().split(' ').toMutableList()
    val inputInt = inputNumber.map {it.toInt()}
    // println(inputInt)

    //文字列部分の取得
    val inputStr = mutableListOf<String>()
    for ( i in 0..inputInt[0]-1){
        val input = readLine().toString()
        inputStr.add(input)
    }
    // println(inputStr)

    //検索部分作成
    val bitList = bitFullSearch(inputInt[0])
    // println(bitList)

    //検索部分
    var ans = 0
    val alphabet = "abcdefghijklmnopqrstuvwxyz"

    for(i in bitList){
        val bitListArray = i.stream().toArray()
        // if(bitListArray.size <= 1) continue

        val checkList = mutableListOf<Int>(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

        for(j in bitListArray){
        // println(j)

            for(k in inputStr[j]){
                val num = alphabet.indexOf(k)
                checkList[num]++
            }
        }

        // println(checkList)


        var count = 0
        checkList.map{
            if(it == inputInt[1]){
                count++
            }
            if(count > ans){
                ans = count
            }
        }
        
    }

    println(ans)
    




}