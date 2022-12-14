/* If and when keywords can be used to assign a value to a local
variable. Kotlin lacks a ternary operator, so an if expression can be
used to mimic it. Syntax is

variable = if (expression) evaluateTrue else evaluate false

Same principle works with when, which can be used as an expression
 */

fun main() {

    val harleyAge = 25

    val harleyStageOfLife =
        if (harleyAge > 18) "harley is adult" else "harley is child"

    println(harleyStageOfLife)

    val harleyBestSport = "Football"

    val harleyFavSport = when(harleyBestSport) {

        "Baseball" -> "Baseball is my favourite sport"
        "Football" -> "Football is my favourite sport"
        else -> "Harley has no favourite sport"
    }

    println(harleyFavSport)


}