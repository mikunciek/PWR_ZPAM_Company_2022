class Company() { //zadanie 3

    private val employeeList = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) { //dodanie pracownika

        if (employeeList.filter { it.pesel == employee.pesel }.isEmpty()) {
            employeeList.add(employee)
            println("Employee added")
        } else {
            println("The employee has already been added")
        }
    }

    fun removeEmployee(pesel: String) { //usuwanie pracownika
        val toRemove = employeeList.singleOrNull {
            it.pesel == pesel
        }
        if (toRemove == null) throw NoSuchEmployeeException()
        else employeeList.remove(toRemove)
    }

    fun displayList() { //wyświetlanie listy
        println(employeeList)
    }

    fun stats(): Map<String, Int> { //statystyki
        return employeeList
            .groupBy { it.nameDepartment }
            .map { (key, value) -> key to value.size }
            .toMap()
    }
}

