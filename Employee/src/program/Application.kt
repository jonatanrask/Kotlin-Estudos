package program

import entities.Employee
import java.util.Locale

object Application {
    @JvmStatic
    fun  main(args: Array<String>){
        Locale.setDefault(Locale.US)

        val employee = Employee()
        println("Enter the employee name")
        employee.name = readLine().toString()
        println("Enter gross salary")
        employee.grossSalary = readLine()?.toDoubleOrNull() ?: 0.0
        println("Enter the tax")
        employee.tax = readLine()?.toDoubleOrNull() ?: 0.0

        println("Employee: $employee")

        println("Which percentage to increase salary?")
        employee.increaseSalary(readLine()?.toDoubleOrNull() ?: 0.0)

        println("Updated data: $employee")
    }
}