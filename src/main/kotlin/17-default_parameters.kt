/*
Default parameters allow you to assign a default value to a parameter if it
is not provided when the function is invoked.
 */
fun defaultParameters(num1: Int = 1, num2: Int = 2, num3: Int = 0) {

    println(num1 + num2 + num3)

}
fun main() {

    defaultParameters()
    defaultParameters(5, 10)
    defaultParameters(num3 = 33)

}