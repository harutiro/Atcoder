import java.net.URI

fun main(){

    val str = URI("https://hogehoge.com/").rawAuthority

    println(str)
}