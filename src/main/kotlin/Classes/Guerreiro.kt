package classes

import Personagem

// Classe para a classe Guerreiro

class Guerreiro(nome: String, nivel: Int) : Personagem(nome, nivel) {
    override fun calcularPV(): Int {
        return (10 * nivel) + (modificadorConstituicao() * nivel)
    }

    override fun atacar() : Int {
        return (1 + nivel/2) + modificadorForca()
    }
}
