fun main() {

    println("Bem-vindo ao ByteBank!")

    val titular = "Emerson"
    val numeroConta = 1000
    var saldo = 0.0
    saldo += 100

    println("Titular: $titular")
    println("Conta: $numeroConta")
    println("Saldo: $saldo")

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }

    for (i in 1..5) println(i)
    for (i in 6 downTo 0 step 2) println(i)

    val conta1 = Conta("Emerson", 1001)
    conta1.depositar(300.0)

    // Utilizando labels não precisamos seguir a ordem do construtor.
    val conta2 = Conta(numero = 1002, titular = "Fran")

    println(conta2.titular)
    conta1.depositar(50.0)
    println(conta1.saldo)

    conta1.sacar(5.0)
    println(conta1.saldo)

    println("Saldo da conta 2: ${conta2.saldo}")
    conta1.transferir(conta2, 10.0)
    println("Saldo da conta 1: ${conta1.saldo}")
    println("Saldo da conta 2: ${conta2.saldo}")

}

class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) saldo -= valor
        else println("Saldo insuficiente")
    }

    fun transferir(conta: Conta, valor: Double): Boolean {
        return if (saldo >= valor) {
            saldo -= valor
            conta.depositar(valor)
            true
        } else {
            println("Saldo insuficiente para realizar essa transferência")
            false
        }
    }


}
