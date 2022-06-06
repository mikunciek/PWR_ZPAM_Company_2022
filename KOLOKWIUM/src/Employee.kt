import Department.*

//zad 2

class Employee(
    val pesel: String,
    val name: String,
    val surname: String,
    val nameDepartment: String,
) {
    //konstruktor wtórny
    constructor(pesel: String, name: String, surname: String, nameDepartment: Int)
            : this(
        pesel, name, surname,

        (if (nameDepartment == 0) {
            HR

        } else {
            if (nameDepartment == 1) {
                MARKETING
            } else {
                IT
            }

        }
                ) as String
    )

    override fun toString(): String {
        return "($name, $surname, $nameDepartment)"
    }


}