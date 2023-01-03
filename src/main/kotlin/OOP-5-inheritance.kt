open class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {

    fun makeCoffee() {
        println("Here is coffee")
    }

}

/*
To inherit from another class, type a : then the parent class name. Classes are final
by default, so you have to put the keyword on the parent class
 */

class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String
) : BaseCoffeeMachine(price, color) {

    fun makePremiumCoffee() {
        println("Premium Coffee made")
    }

}

fun main() {

    val coffeeMachine = BaseCoffeeMachine(59.99, "red")
    coffeeMachine.makeCoffee()

    val premiumCoffeeMachine = PremiumCoffeeMachine(99.99, "gold")
    premiumCoffeeMachine.makePremiumCoffee()
}