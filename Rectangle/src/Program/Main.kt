package program

import entities.Rectangle
import java.util.*

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Locale.setDefault(Locale.US)
        val sc = Scanner(System.`in`)

        val rectangle = Rectangle()

        println("Enter the width and height of the rectangle:")
        rectangle.width = sc.nextDouble()
        rectangle.height = sc.nextDouble()
        sc.close()

        print(rectangle)
    }
}