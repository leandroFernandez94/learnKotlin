/**
 * Created by leandro on 1/8/18.
 */
fun main(args: Array<String>){
    val name = "Derek" //inmutable, infiere tipo String

    var myAge = 42 //mutable, infiere Integer

    //tipos numericos

    var bigInt = Int.MAX_VALUE
    var smallInt = Int.MIN_VALUE

    println("Biggest int " + bigInt)
    println("Smallest int $smallInt")

    var bigLong = Long.MAX_VALUE
    var smallLong = Long.MIN_VALUE

    println("Biggest Long " + bigLong)
    println("Smallest Long $smallLong")

    var bigDouble = Double.MAX_VALUE
    var smallDouble = Double.MIN_VALUE

    println("Biggest Double " + bigDouble)
    println("Smallest Double $smallDouble")

    var bigFloat = Float.MAX_VALUE
    var smallFloat = Float.MIN_VALUE

    println("Biggest Float " + bigFloat)
    println("Smallest Float $smallFloat")

    if(true is Boolean){
        println("true is Boolean")
    }
}