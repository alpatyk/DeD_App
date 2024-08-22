package org.example.Raca

import Personagem

class Anao(
    nome: String,
    nivel: Int
) : Personagem(nome, nivel) {

    init {
        // Aplicar bônus raciais

        this.con += 2

    }
}
