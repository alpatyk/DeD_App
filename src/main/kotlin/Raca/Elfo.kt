package org.example.Raca

import Personagem

class Elfo(
    nome: String,
    nivel: Int
) : Personagem(nome, nivel) {

    init {
        // Aplicar bônus raciais

        this.dex += 2

    }
}
