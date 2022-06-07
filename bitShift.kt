fun main(){
    var bit = 0b1010

    bit = bit shr 1

    println(String.format("%4s", Integer.toBinaryString(bit)).replace(" ", "0"))

}