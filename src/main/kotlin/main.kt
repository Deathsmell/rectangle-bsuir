fun main() {
    val rectangle = Rectangle()
    println("Rectangle without values:\n$rectangle\n")
    rectangle.width = 2F
    println("Rectangle with width value:\n$rectangle\n")
    rectangle.height = 2F
    println("Rectangle with same height and width values:\n$rectangle\n")
    rectangle.width = 5.5F
    println("Rectangle with different height and width values:\n$rectangle\n")
    val rectangleWithInitialValues = Rectangle(1, 5)
    println("Rectangle with initial values:\n$rectangleWithInitialValues\n")
}