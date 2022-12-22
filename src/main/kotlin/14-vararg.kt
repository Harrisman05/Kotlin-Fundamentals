/*
Varargs - Allows you to pass in any number of arguments, a vararg parameter
It's sort of similar to how the rest parameter works in JS.
 */

fun sum(vararg nums: Int): Int {

    var sum: Int = 0

    for (number in nums) {
        sum += number
    }

    return sum

}
fun main() {

    println(sum(1,2,3))
    println(sum())

}