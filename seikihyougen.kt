fun main(){
    val re1 = Regex("^[a-z]\\d{5}$")

    println("k22120".matches(re1));//true
    println("00aass".matches(re1));//false

    val re2 = Regex("\\d{2}.\\d{1}$")

    println("36.5".matches(re2));
    println("222.22".matches(re2));

}