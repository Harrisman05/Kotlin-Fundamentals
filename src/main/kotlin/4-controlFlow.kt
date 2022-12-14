var salutation: String? = "Hello there"

/* If statements have similar syntax to JavaScript, with brackets and {}
blocks. If, else if and else are the reserved keyword
 */

fun main() {

    if (salutation != null) {
        println(salutation)
    }

    salutation = null

    if (salutation == null) {
        println("Salutation is null")
    }

    val pi = 3.14

    if (pi > 4) {
        println("Impossible")
    } else if (pi < 3) {
        println("Impossible")
    } else {
        println("The value of PI is inbetween 3 and 4")
    }

}