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