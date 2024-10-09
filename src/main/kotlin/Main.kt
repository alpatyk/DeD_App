import Classes.ClerigoStrategy
import Classes.LadinoStrategy
import Classes.MagoStrategy
import Raca.Anao
import Raca.Elfo
import Raca.Humano
import atributos.DistribuicaoPontosStrategy
import Classes.GuerreiroStrategy


fun main() {
    println("Insira o nome do personagem:")
    val nome = readLine() ?: "Sem Nome"

    println("Insira o nível do personagem:")
    val nivel = readLine()?.toIntOrNull() ?: 1

    // Escolher a raça do personagem
    println("Escolha a raça do personagem (1. Humano, 2. Elfo, 3. Anão):")
    val racaEscolhida = readLine()?.toIntOrNull()

    val racaStrategy = when (racaEscolhida) {
        1 -> Humano()
        2 -> Elfo()
        3 -> Anao()
        else -> Humano()  // Default
    }

    // Método de criação de atributos: Distribuição de Pontos
    val atributosStrategy = DistribuicaoPontosStrategy()

    // Escolher a classe do personagem
    //coment
    println("Escolha a classe do personagem (1. Guerreiro, 2. Mago, 3. Ladino, 4. Clérigo):")
    val classeEscolhida = readLine()?.toIntOrNull()

    val classeStrategy = when (classeEscolhida) {
        1 -> GuerreiroStrategy()
        2 -> MagoStrategy()
        3 -> LadinoStrategy()
        4 -> ClerigoStrategy()
        else -> GuerreiroStrategy()  // Default
    }

    // Criação do personagem
    val personagem = Personagem(nome, nivel, atributosStrategy, classeStrategy, racaStrategy)
    personagem.mostrarStatus()

    // Exemplo de ataque
    println("O personagem ataca e causa ${personagem.atacar()} de dano!")
}
