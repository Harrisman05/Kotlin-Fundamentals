/*
    For loops - Fairly trivial syntax, for (iterator in iterable)

    Kotlin supports functional programming - for example, using forEach
    higher order function.

    Functions are first class citizens (can be
    passed to and returned from functions), so Kotlin can support
    functional programming.

 */

fun main() {

    val numbers = arrayOf(1,2,3,4,5)

    for (number in numbers) {
        println(number)
    }

    numbers.forEach { // it is default name of the iterator in forEach
        println(it)
    }

    numbers.forEach { number -> // can rename iterator
        println(number)
    }

    numbers.forEachIndexed { index, number ->
        println("$number is at index $index")
    }

}