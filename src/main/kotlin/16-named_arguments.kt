
/*
Named arguments - Allows you to specify arguments in a different order in
which they are defined in the function signature
 */

fun greeting(name: String, message: String, mood: String) {

    println("Hello $name, $message Your mood today is $mood")

}
fun main() {
    greeting(mood = "happy", message = "How are you?", name = "Harley")
}