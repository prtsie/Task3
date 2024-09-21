fun main(args: Array<String>) {
    val values = arrayOf("камень", "ножницы", "бумага")

    for (i in values.indices) {
        println("$i - ${values[i]}")
    }
    var input: Int?
    while (true) {
        print("Введите номер >>> ")
        input = readln().toIntOrNull()
        if (input == null || input >= values.count()) {
            println("Неправильное значение")
        } else break
    }
    val userChoice = values[input!!]
    val compChoice = values.random()
    println("Игрок выбрал $userChoice")
    println("Компьютер выбрал $compChoice")
    println(process(userChoice, compChoice))
}

fun process(userChoice: String, compChoice: String) =
    when (userChoice) {
        "камень" -> when (compChoice) {
            "камень" -> "Ничья"
            "ножницы" -> "Игрок победил"
            "бумага" -> "Компьютер победил"
            else -> "Всё сломалось"
        }
        "ножницы" -> when (compChoice) {
            "камень" -> "Компьютер победил"
            "ножницы" -> "Ничья"
            "бумага" -> "Игрок победил"
            else -> "Всё сломалось"
        }
        "бумага" -> when (compChoice) {
            "камень" -> "Игрок победил"
            "ножницы" -> "Компьютер победил"
            "бумага" -> "Ничья"
            else -> "Всё сломалось"
        }
        else -> "Всё сломалось"
    }