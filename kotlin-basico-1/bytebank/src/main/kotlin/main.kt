fun main() {

    println("Bem vindo ao ByteBank!")
    val titular: String = "Celso"
    val numeroConta: Int = 1439
    var saldo: Double = 10.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")
    println()

}

fun estruturaRepeticao() {
    // Cria 5 contas
    for (i in 1..5) {
        println("Bem vindo ao ByteBank!")
        val titular: String = "Celso $i"
        val numeroConta: Int = 1439 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    // Cria 5 contas na ordem decrescente
    for (i in 5 downTo 1) {
        println("Bem vindo ao ByteBank!")
        val titular: String = "Celso $i"
        val numeroConta: Int = 1439 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    // Cria 3 contas de 2 em 2
    for (i in 1..5 step 2) {
        println("Bem vindo ao ByteBank!")
        val titular: String = "Celso $i"
        val numeroConta: Int = 1439 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    // Cria apenas 4 contas do 1 até 4
    for (i in 1 until 5) {
        println("Bem vindo ao ByteBank!")
        val titular: String = "Celso $i"
        val numeroConta: Int = 1439 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    // Loop com while
    var i = 0
    while (i < 5) {
        println("Bem vindo ao ByteBank!")
        val titular: String = "Celso $i"
        val numeroConta: Int = 1439 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }
}

fun testeCondicional(saldo: Double) {
    // Estrutura condicional com IF-ELSE
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    // Estrutura condicional com when
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}