package Basic

fun main(args: Array<String>) {
    val employee = readInputs()

    val workedSalary: Double = calculateWorkedHourSalary(employee.workedHours, employee.valuePerHour)

    println("NUMBER = ${employee.employeeNumber}")
    println("SALARY = U$ ${"%.2f".format(workedSalary)}")
}

private fun readInputs(): Employee {
    val employeeNumber: Int = readLine()!!.toInt()
    val workedHours: Int = readLine()!!.toInt()
    val valuePerHourWorked: Double = readLine()!!.toDouble()

    return Employee(employeeNumber, workedHours, valuePerHourWorked)
}

private class Employee(val employeeNumber: Int, val workedHours: Int, val valuePerHour: Double)

private fun calculateWorkedHourSalary(workedHours: Int, valuePerHour: Double) = workedHours * valuePerHour
