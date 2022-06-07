// import java.util.BitSet

// fun bitFullSearch(n: Int): List<BitSet> = (0 until (1 shl n)).map { bit ->
//     BitSet(n).apply {
//         repeat(n) { i ->
//             set(i, bit and (1 shl i) > 0)
//         }
//     }
// }

// fun main(){
//     val list = bitFullSearch(4)
//     println(list)
// }

fun main(arg:Array<String>){
    for(i in 1..16){
        println("$i　を2進数で表すと"+tenToRadix(i,2))
    }

    for(i in 1..16){
        println("$i を8進数で表すと"+tenToRadix(i,8))
    }
}

//例えばnumに10,mathRadixに2を入れると10を2進数に変換して
//1010を返す
//またnumに10,mathRadixに8を入れると10を8進数に変換して
//12を返す
fun tenToRadix(num:Int,mathRadix:Int):String{
    var funNum = num
    var result:String = ""
    while(funNum >= mathRadix){
        result = result+Integer.toString(funNum%mathRadix)
        funNum = funNum/mathRadix
    }
    result = result+Integer.toString(funNum)
    return result.reversed();
}