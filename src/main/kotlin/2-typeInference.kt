
/* Kotlin can imply the type of a variable given its value, meaning that
explicitly defining the types can be omitted */

var inferred_string = "I am variable with its type inferred"
var explicit_string: String = "An explicitly typed variable"

fun main() {

    println(inferred_string)
    println(explicit_string)

}