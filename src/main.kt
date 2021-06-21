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
}