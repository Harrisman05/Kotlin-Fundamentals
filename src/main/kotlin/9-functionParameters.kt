/* Function Parameters
    Parameter name are displayed in IDE, and types must be declared in function declaration
 */

fun displayMood(name: String, mood: String): String {
    return "Hello I am $name, my mood today is $mood"
}

fun weatherToday(temperature: Number): String = "Today, the temperature is $temperature C"

fun main() {
    println(displayMood("Harley", "good"))
    println(weatherToday(50))
}