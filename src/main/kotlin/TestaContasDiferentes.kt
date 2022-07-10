fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )


    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)

    println("Valor depositado na corrente: ${contaCorrente.saldo}")
    println("Valor depositado na popanca: ${contaPoupanca.saldo}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)

    println("Valor sacado na corrente: ${contaCorrente.saldo}")
    println("Valor sacado na poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Valor conta corrente após a transferencia: ${contaCorrente.saldo}")
    println("Valor conta poupanca após transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Valor conta corrente após a transferencia: ${contaCorrente.saldo}")
    println("Valor conta poupanca após transferencia: ${contaPoupanca.saldo}")
}