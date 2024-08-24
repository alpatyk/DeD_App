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

                if (pontosAdicionar <= pontosRestantes) {
                    val novoValor = atributos[atributo]!! + pontosAdicionar
                    if (novoValor > 15) {
                        if (pontosAdicionar * 2 <= pontosRestantes) {
                            atributos[atributo] = novoValor
                            pontosRestantes -= pontosAdicionar * 2
                        } else {
                            println("Não há pontos suficientes para adicionar ao atributo $atributo.")
                        }
                    } else {
                        atributos[atributo] = novoValor
                        pontosRestantes -= pontosAdicionar
                    }
                } else {
                    println("Você não tem pontos suficientes para isso.")
                }
            }
        }

        return atributos
    }
}
