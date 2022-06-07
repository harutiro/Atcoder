fun main(){
    val getString: String? = readLine()

    var number:Int = getString?.toIntOrNull(2) ?: 0

    //println(Integer.toBinaryString(number))

    number = number shr 1

    println(String.format("%4s", Integer.toBinaryString(number))
        .replace(" ", "0")
        .takeLast(4)
    )

}
