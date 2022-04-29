fun main(){

    val namber: String? = readLine()

    var arrayNumber = arrayListOf('0','1','2','3','4','5','6','7','8','9','0')
    
    for ( i in namber!!.toCharArray()){
        truecase@ for((index,j) in arrayNumber.withIndex()){
            if(i == j){
                arrayNumber.removeAt(index)
                break@truecase
            }
        }
    }



    println(arrayNumber[0])



}