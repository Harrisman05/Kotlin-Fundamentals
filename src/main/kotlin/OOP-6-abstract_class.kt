/*
    Abstract class:

    Abstract is a keyword, allows you to define members or functions of a class without the
    implementation. The abstract keyword enables you to create classes and class members
    that are incomplete and must be implemented in a derived class.

    The role of an abstract class is to just provide a set of methods and properties. You
    need to override abstract methods, properties inside derived/child class

    The purpose of an abstract class is to provide a common definition of a base class that
    multiple derived classes can share.

    Cannot create instances/objects

 */

abstract class Weapon {


    // Defining member/instance/class variables with abstract keyword. Abstract keyword can
    // Only be used inside abstract class

    abstract val type: String

    // Abstract functions have no body, the body is implemented when the function is called
    abstract fun printWeapon(): Unit

}

/*
Abstract variables/functions MUST BE OVERWRITTEN in the child classes.
 */
class Sword: Weapon() {

    override val type: String = "Sword"

    override fun printWeapon() {
        println("I am a sword")
    }

}

class BattleAxe: Weapon() {

   override val type: String = "BattleAxe"

    override fun printWeapon() {
        println("I am a BattleAxe")
    }

}

fun main() {

    val sword1 = Sword()
    val battleaxe1 = BattleAxe()

    println(sword1.type)
    sword1.printWeapon()


    println(battleaxe1.type)
    battleaxe1.printWeapon()

}

