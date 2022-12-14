/* Return type of functions should be defined in function declaration

   In main function, there's no return type declared. This could be
   explicitly typed using Unit (same as Void), but it is optional.

   Function declared at the top of the scope are free functions or top
   level functions, they do not belong to any class and can be used by
   other classes
*/

fun getGreeting(): String {
    return "Hello Kotlin"
}

fun sayHello(): Unit {
    println(getGreeting())
}

fun getNullable(): String? {
    return null
}

fun main() {

    println(getGreeting())
    sayHello()
    println(getNullable())

}