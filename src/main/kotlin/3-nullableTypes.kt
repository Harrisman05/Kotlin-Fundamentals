
/* Types are non-null by default in Kotlin, meaning that they cannot
be assigned a null type. This is different to Java, and prevents the
NullPointerException Error

Means there is a difference between String and Nullable String.
 */

var name = "Harley"
var greeting: String? = "Hello"
var nulltype = null // Implicit nothing type as this variable has no
// inferred type, so it's implicitly a Nothing type

fun main() {

    println(name)
    println(greeting)

    greeting = null // greeting re-assign to null is allowed as greeting
    // nullable

    println(greeting)

    println(nulltype)

}