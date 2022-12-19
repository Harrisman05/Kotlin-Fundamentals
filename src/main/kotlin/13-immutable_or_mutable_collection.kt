/*
Collections are immutable by default in Kotlin. Elements cannot be added
or taken away from them by default.
 */
fun main() {

    val immutableArray = listOf("immutable", "immutable by default")

    // There are no add/remove methods available by default in Kotlin

    val mutableArray = mutableListOf("mutable", "change me")

    mutableArray.add("Added item to mutable array")
    mutableArray.removeAt(0)

    println(mutableArray)

    val immutableMap = mapOf(1 to "a", 2 to "b")
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 33 to "?")

    mutableMap.put(555, "large number")

    println(mutableMap)

}