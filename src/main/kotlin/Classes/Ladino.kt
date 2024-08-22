package classes

import Personagem

// Classe para a classe Ladino
class Ladino(nome: String, nivel: Int) : Personagem(nome, nivel) {

    override fun calcularPV(): Int {
        return (6 * nivel) + ( modificadorConstituicao() * nivel )
    }

    fun atacarFurtivo() {
        println("$nome realiza um ataque furtivo!")
    }
}
