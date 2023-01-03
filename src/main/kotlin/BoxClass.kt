class BoxClass {

    // properties defined with val are immutable

    val length: Int = 10
    var width: Int = 20
    var height: Int = 5

    // Getter/setter is automatically created in Kotlin under
    // the hood, so properties can be get/set immediately
    val volume
        get() = length * width * height

    // With setter, field means we are references the value passed into
    // the setter function
    var boxName: String = ""
        set(value) {
            if(value.length < 3){
                println("Name cannot be less than 3 chars")
            } else {
                field = value
            }
        }
    fun getArea(): Int {
       return length * width * height
    }

    fun fillContents() {
        println("Box is Filled")
    }

    fun open() {
        println("Open Box")
    }

}