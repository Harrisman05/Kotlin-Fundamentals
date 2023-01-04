
/*
Interfaces are similar to abstract classes, but they support multiple inheritance so derived
classes can inherit multiple interfaces.


 */

interface Metal {

    val color: String
    val isMagnetic: Boolean

}

interface Ore {

    val oxideName: String

}

class Iron: Metal, Ore {

    override val color: String = "grey"
    override val isMagnetic: Boolean = true
    override val oxideName: String = "Magnetite"

}

fun main() {

    val iron_bar: Iron = Iron()

    println(iron_bar.color)
    println(iron_bar.isMagnetic)
    println(iron_bar.oxideName)

}





