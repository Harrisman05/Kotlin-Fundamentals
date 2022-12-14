/* When keyword

    when works similar to a switch statement in JavaScript. Evaluating a
    value against multiple case statements

 */

fun main() {

    val weekendDay = "Sunday"

    when(weekendDay) {

        "Saturday" -> println("It's Monday")
        "Sunday" -> println("It's Sunday")
        else -> "It's not the weekend"

    }

    val weekday = "Monday"

    when(weekday) {

        "Saturday" -> println("It's Monday")
        "Sunday" -> println("It's Sunday")
        else -> println("It's not the weekend")

    }
}