fun main() {

    println("Bem vindo ao ByteBank!")

    val contaCelso = Conta("Celso", 1000)
    contaCelso.deposita(200.0)
    println("Titular: ${contaCelso.titular}")
    println("Numero: ${contaCelso.numero}")
    println("Saldo: ${contaCelso.saldo}")

    val contaJeane = Conta("Jeane", 1001)
    contaJeane.deposita(1.0)
    println("Titular: ${contaJeane.titular}")
    println("Numero: ${contaJeane.numero}")
    println("Saldo: ${contaJeane.saldo}")

    contaCelso.deposita(50.0)
    contaCelso.saque(160.0)
    contaCelso.transfere(50.0, contaJeane)
    println("Saldo: ${contaJeane.saldo}")
}

class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }

    fun transfere(valor: Double, contaDestino: Conta) {
        this.saque(valor)
        contaDestino.deposita(valor)
    }
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

fun estruturaCondicional(saldo: Double) {
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