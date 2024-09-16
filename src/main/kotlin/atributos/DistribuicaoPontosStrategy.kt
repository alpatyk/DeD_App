package atributos

class DistribuicaoPontosStrategy : atributoStrategy {
    override fun gerarAtributos(): Map<String, Int> {
        val atributos = mutableMapOf("str" to 8, "dex" to 8, "con" to 8, "int" to 8, "sab" to 8, "car" to 8)
        var pontosRestantes = 27

        while (pontosRestantes > 0) {
            println("Distribua seus pontos. Você tem $pontosRestantes pontos restantes.")
            atributos.forEach { (atributo, valor) ->
                println("$atributo (atual: $valor): Quantos pontos deseja adicionar?")
                val pontosAdicionar = readLine()?.toIntOrNull() ?: 0

                val novoValor = atributos[atributo]!! + pontosAdicionar
                when {
                    novoValor > 15 -> {
                        println("O valor máximo para qualquer atributo é 15.")
                    }
                    novoValor == 15 -> {
                        // Adicionar o 15º ponto custa 2 pontos para cada 1 adicionado
                        if (pontosAdicionar * 2 <= pontosRestantes) {
                            atributos[atributo] = novoValor
                            pontosRestantes -= pontosAdicionar * 2
                        } else {
                            println("Não há pontos suficientes para aumentar o atributo $atributo para 15.")
                        }
                    }
                    novoValor in 9..14 -> {
                        // Aumentos normais para atributos até 14
                        if (pontosAdicionar <= pontosRestantes) {
                            atributos[atributo] = novoValor
                            pontosRestantes -= pontosAdicionar
                        } else {
                            println("Você não tem pontos suficientes para adicionar ao atributo $atributo.")
                        }
                    }
                    else -> {
                        println("Entrada inválida. Certifique-se de adicionar um número de pontos válido.")
                    }
                }
            }
        }

        return atributos
    }
}
