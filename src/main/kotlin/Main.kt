import classes.Guerreiro
import classes.Mago
import classes.Ladino
import classes.Clerigo
import org.example.Raca.Humano
import org.example.Raca.Anao
import org.example.Raca.Elfo

fun main() {
    // Coletar dados do personagem
    println("Insira o nome do personagem:")
    val nome = readLine() ?: "Sem Nome"

    println("Insira o nível do personagem:")
    val nivel = readLine()?.toIntOrNull() ?: 1

    // Permitir ao usuário escolher uma raça
    println("Escolha a raça do personagem (1. Humano, 2. Elfo, 3. Anao):")
    val racaEscolhida = readLine()?.toIntOrNull()

    val personagemBase = when (racaEscolhida) {
        1 -> Humano(nome, nivel)
        2 -> Anao(nome, nivel)
        3 -> Elfo(nome, nivel)
        else -> Humano(nome, nivel)  // Padrão para Humano se a escolha for inválida
    }

    // Permitir ao usuário escolher uma classe
    println("Escolha a classe do personagem (1. Guerreiro, 2. Mago, 3. Ladino, 4. Clérigo):")
    val classeEscolhida = readLine()?.toIntOrNull()

    val personagemFinal = when (classeEscolhida) {
        1 -> Guerreiro(personagemBase.nome, personagemBase.nivel).apply {
            this.str = personagemBase.str
            this.dex = personagemBase.dex
            this.con = personagemBase.con
            this.int = personagemBase.int
            this.sab = personagemBase.sab
            this.car = personagemBase.car
        }
        2 -> Mago(personagemBase.nome, personagemBase.nivel).apply {
            this.str = personagemBase.str
            this.dex = personagemBase.dex
            this.con = personagemBase.con
            this.int = personagemBase.int
            this.sab = personagemBase.sab
            this.car = personagemBase.car
        }
        3 -> Ladino(personagemBase.nome, personagemBase.nivel).apply {
            this.str = personagemBase.str
            this.dex = personagemBase.dex
            this.con = personagemBase.con
            this.int = personagemBase.int
            this.sab = personagemBase.sab
            this.car = personagemBase.car
        }
        4 -> Clerigo(personagemBase.nome, personagemBase.nivel).apply {
            this.str = personagemBase.str
            this.dex = personagemBase.dex
            this.con = personagemBase.con
            this.int = personagemBase.int
            this.sab = personagemBase.sab
            this.car = personagemBase.car
        }
        else -> Guerreiro(personagemBase.nome, personagemBase.nivel).apply {
            this.str = personagemBase.str
            this.dex = personagemBase.dex
            this.con = personagemBase.con
            this.int = personagemBase.int
            this.sab = personagemBase.sab
            this.car = personagemBase.car
        }  // Padrão para Guerreiro se a escolha for inválida
    }

    // Mostrar status do personagem final
    personagemFinal.mostrarStatus()

    // Exemplo de ação específica da classe
    when (personagemFinal) {
        is Guerreiro -> personagemFinal.atacar()
        is Mago -> personagemFinal.lançarMagia()
        is Ladino -> personagemFinal.atacarFurtivo()
        is Clerigo -> personagemFinal.curar()
    }
}
