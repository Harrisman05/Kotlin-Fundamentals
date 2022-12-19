fun main() {

    val array = listOf("hello", "name", "red")

    /* Map of will take in pairs. Pairs is a wrapper class containing two
    values, and there is a convenience function (to) to create pairs.
    */

    val map = mapOf(1 to "a", 2 to "b", 3 to "3")

    // Using forEach to print the key value pairs

    map.forEach{ (key, value) ->
        println("$key $value")
    }

}