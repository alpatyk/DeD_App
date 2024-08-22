package org.example.Raca

import Personagem

class Humano(
    nome: String,
    nivel: Int
) : Personagem(nome, nivel) {

    init {
        // Aplicar bônus raciais
        this.str += 1
        this.con += 1
        this.dex += 1
        this.int += 1
        this.sab += 1
        this.car += 1
    }
}


