import Classes.ClasseStrategy
import Raca.Raca
import atributos.atributoStrategy

class Personagem(
    val nome: String,
    val nivel: Int,
    private val atributosStrategy: atributoStrategy,
    private val classeStrategy: ClasseStrategy,
    private val racaStrategy: Raca
) {
    var atributos: MutableMap<String, Int> = atributosStrategy.gerarAtributos().toMutableMap()
    var pv: Int = 0

    init {
        // Aplica os bônus da raça nos atributos
        racaStrategy.aplicarBonusAtributos(atributos)

        // Calcula os pontos de vida com base na classe e constituição modificada
        val modificadorConstituicao = ((atributos["con"] ?: 10) - 10) / 2
        pv = classeStrategy.calcularPV(nivel, modificadorConstituicao)
    }

    fun atacar(): Int {
        val modificadorForca = (atributos["str"] ?: 10 - 10) / 2
        return classeStrategy.atacar(modificadorForca, nivel)
    }

    fun mostrarStatus() {
        println("Nome: $nome")
        println("Nível: $nivel")
        println("PV: $pv")
        atributos.forEach { (atributo, valor) ->
            println("$atributo: $valor")
        }
    }
}
