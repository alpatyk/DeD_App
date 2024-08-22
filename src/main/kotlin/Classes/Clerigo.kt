package classes

import Personagem

// Classe para a classe Clérigo
class Clerigo(nome: String, nivel: Int) : Personagem(nome, nivel) {
    override fun calcularPV(): Int {
        return (8 * nivel ) + (modificadorConstituicao() * nivel)

    }


    fun curar() {
        println("$nome cura um aliado!")
    }
}
