import java.lang.Double

fun isNumeric(string: String): Boolean { //sprawdza czy jest numerem
    var numeric = true
    try {
        val num = Double.parseDouble(string)
    } catch (e: NumberFormatException) {
        numeric = false
    }
    return numeric
}

fun checkPesel(n: String): Boolean { //sprawdzenie czy to pesel
    val flag: Boolean = isNumeric(n)
    if (!flag) {
        throw NumberFormatException(": Wypisz cyfry")
    }
    if (n.length != 11) {
        throw LenghtException("Nieprawidłowa długość")
    }
    return true
}

fun checkString(name: String): Boolean { //sprawdza czy nie jest pusty
    val name = name ?: throw StringFormatException(": Empty string")

    return true
}

fun main() {
    //zad5
    //stworzenie obiektu Company
    val company = Company()
    company.displayList()

    val c1 = Employee("12345678910", "Anna", "Nowak", 5)
    company.addEmployee(c1)

    company.displayList()

    while (true) {

        println("„Do you want to create an employee?" + "Y/N")
        val answer = readLine().toString()
        if (answer == "T") {
            continue //Dalsze działanie programu, czeka na poprawną odpowiedź
        }

        //wczytanie danych

        println("PESEL: ")
        val pesel = readLine().toString()

        println("Name:")
        val name = readLine().toString()

        println("Surname: ")
        val surname = readLine().toString()

        println("Deparment - 0 == HR, 1 == MARKETING, any: IT")
        val department = readLine().toString()

        val c = Employee(pesel, name, surname, department)


        //sprawdzenie poprawności danych
        val checkPesel = checkPesel(pesel)
        val checkName = checkString(name)
        val checkSurname = checkString(surname)
        val checkDepartment = isNumeric(department)

        //gdy wszystkie poprawne to dodaj
        if (checkPesel && checkName && checkSurname && checkDepartment == true) {
            company.addEmployee(c)
        } else {
            println("Incorrect data")
        }
    }

    company.displayList() //wyświetlenie listy
    company.removeEmployee(c1) //usunięcie pracownika
    company.stats() //statystyki

}
