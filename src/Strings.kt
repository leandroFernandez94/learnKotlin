/**
 * Created by leandro on 1/8/18.
 */
fun main(args: Array<String>){

    val myName = "Derek Banas"
    val longStr = """This is a
        Long String"""


    val str1 = "A random string"
    val str2 = "Another random string"

    println("Strings equal: " + str1.equals(str2))
    println("Compare A to B: " + "A".compareTo("B"))

    println("2nd index: " + str1[2])
    println("Index 2 - 7: " + str1.subSequence(2,8))
    println("Contains 'random': " + str1.contains("random"))
}