
/*
Primary constructor used to create instance of Car class with
properties, constructor word can be ommited.

Can add access modifier on primary constructor as well.

Secondary constructors are available in Kotlin, but ideally
you should only use one constructor per class. Use default parameters
to avoid using secondary constructors.

Init block is immediately called after constructor is called,
ideally there should only be one init block
 */
class Car constructor(
    var colour: String = "default grey",
    var topSpeed: Int = 0,
    var model: String = "default model"
) {

    init {
        println("Init block is called after the constructor function")
    }

}
fun main() {

    var harleyCar = Car("red", 100, "lambo")
    var defaultCar = Car()

    println("Harley car colour: ${harleyCar.colour}")
    println("Default car colour: ${defaultCar.colour}")

}