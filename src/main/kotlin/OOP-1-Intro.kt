fun main() {

    // Create instance of Box Class (no new keyword needed)

    val box1 = BoxClass()
    val box2 = BoxClass()
    val box3 = BoxClass()

    // Kotlin creates getters/setters under the hood

    println("Box1 height: ${box1.height}")

    box2.getArea()
    box3.fillContents()

    // Setter, changes mutable width value

    box2.width = 2

    println("Box 2 changed width: ${box2.width}")

}
