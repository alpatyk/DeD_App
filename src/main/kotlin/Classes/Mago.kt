package classes

import Personagem

// Classe para a classe Mago
class Mago(nome: String, nivel: Int) : Personagem(nome, nivel) {
    override fun calcularPV(): Int {
        return (4 * nivel) + (modificadorConstituicao() * nivel)
    }

    fun lançarMagia() {
        println("$nome lança uma magia poderosa!")
    }
}