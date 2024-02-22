package entities

import kotlin.math.sqrt

class Rectangle {
    var height: Double = 0.0
    var width: Double = 0.0

    fun area(): Double {
        return height * width
    }

    fun perimeter(): Double {
        return (2 * height) + (2 * width)
    }

    fun diagonal(): Double {
        return sqrt((height * height) + (width * width))
    }

    override fun toString(): String {
        return """
            AREA = ${String.format("%.2f", area())}
            PERIMETER = ${String.format("%.2f", perimeter())}
            DIAGONAL = ${String.format("%.2f", diagonal())}
            """.trimIndent()
    }
}