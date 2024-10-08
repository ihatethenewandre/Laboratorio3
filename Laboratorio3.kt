// Inciso 1 - Clase base Food
abstract class Food(val name: String, val price: Double) {
    abstract fun cook(): String
}

// Inciso 2.1 - Subclase Burger
class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Cocinando Hamburguesa $name ..."
    }
}

// Inciso 2.2 - Subclase Pizza
class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Horneando Pizza $name ..."
    }
}

// Inciso 3 - Interfaz Dessert
interface Dessert {
    fun eat(): String
}

// Inciso 4 - Clase IceCream implementando Dessert
class IceCream(name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String {
        return "Preparando Helado $name ..."
    }

    override fun eat(): String {
        return "Comiendo Helado $name ..."
    }
}

// Inciso 5 - Clase abstracta Drink
abstract class Drink(name: String, price: Double) : Food(name, price) {
    abstract fun pour(): String
}

// Inciso 6 - Subclase Juice
class Juice(name: String, price: Double) : Drink(name, price) {
    override fun pour(): String {
        return "Vertiendo Jugo $name..."
    }

    override fun cook(): String {
        return "Sirviendo Jugo $name..."
    }
}

// Inciso 7 - Extension function discountedPrice
fun Food.discountedPrice(discountPercentage: Double): Double {
    return price - (price * discountPercentage / 100)
}

// Funcion main para demostrar el funcionamiento
fun main() {
    // Inciso 8 - Crear instancias de diferentes alimentos y llamar a cook()
    val burger = Burger("Smoke Tocino", 60.00)
    val pizza = Pizza("Dominator", 90.00)
    val iceCream = IceCream("Vaca Negra", 20.00)
    val juice = Juice("Jamaica", 10.00)

    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
    println(burger.cook())
    println(pizza.cook())
    println(iceCream.cook())
    println(juice.cook())
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    // Inciso 9 - Llamar a eat() en una instancia de IceCream
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
    println(iceCream.eat())
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    // Inciso 10 - Calcular e imprimir el precio con descuento de una hamburguesa
    val discount = 10.0
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
    println("Precio Hamburguesa con Descuento: ${burger.discountedPrice(discount)}")
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}