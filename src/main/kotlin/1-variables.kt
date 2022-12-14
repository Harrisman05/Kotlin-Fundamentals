/* Top-level variables

    Variables which are declared above the main function. Top level
    variables can be accessed by other functions as they are public
 */

var top_level: String = "I am a top level variable"

fun main() {

    /* Variables

    var - defines mutable variables (like let in JS)
    val - defines local read-only variables which can't be re-assigned
    (like const in JS)

     */

    var mood: String = "Happy"
    mood = "Sad"

    println(mood)

    val pi: Number = 3.14

    println(pi)

    printVar() // print top-level variable

}

fun printVar() {

    println(top_level)

}





