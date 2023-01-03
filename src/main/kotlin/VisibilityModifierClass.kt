class VisibilityModifierClass {

    public var availableProperty: String = "I am a public property"
    internal var internalProperty: String = "I am an internal property"
    private var privateProperty: String = "I am a private property"
    protected var protectedProperty: String = "I am a protected String"

    fun printPrivateProperty() {
        println("Private property: $privateProperty")
    }

}

/*
Private property only available to VisibilityModifierClass,
so must be referenced within that class
 */
fun main() {

    var vis_mod = VisibilityModifierClass()

    vis_mod.printPrivateProperty()

}



