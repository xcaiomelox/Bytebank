class TestaFuncionario {
    fun testaFuncionarios() {
        val alex = Analista(
            nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0
        )
        println("Nome: ${alex.nome}")
        println("CPF: ${alex.cpf}")
        println("Salario: ${alex.salario}")
        println("Bonificacao: ${alex.bonificacao()}")

        val fran = Gerente(
            nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 1234

        )
        println("Nome: ${fran.nome}")
        println("CPF: ${fran.cpf}")
        println("Salario: ${fran.salario}")
        println("Bonificacao: ${fran.bonificacao()}")

        if (fran.autentica(1234)) {
            println("Autenticou com sucesso")
        } else {
            println("Falha na autenticação")
        }

        val Gui = Diretor(
            nome = "Gui",
            cpf = "333.333.333-33",
            salario = 4000.0,
            senha = 4000,
            plr = 200.0
        )

        println("Nome: ${fran.nome}")
        println("CPF: ${fran.cpf}")
        println("Salario: ${fran.salario}")
        println("Bonificacao: ${fran.bonificacao()}")

        val maria = Analista(
            nome = "maria",
            cpf = "444.444.444-44",
            salario = 3000.0
        )

        println("Nome: ${maria.nome}")
        println("CPF: ${maria.cpf}")
        println("Salario: ${maria.salario}")
        println("Bonificacao: ${maria.bonificacao()}")

        val calculadora = CalculadoraBonificacao()
        calculadora.registra(alex)
        calculadora.registra(fran)
        calculadora.registra(Gui)
        calculadora.registra(maria)

        println("total de bonificaçao: ${calculadora.total}")
    }
}