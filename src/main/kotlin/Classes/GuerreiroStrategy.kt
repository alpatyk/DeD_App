package Classes

class GuerreiroStrategy : ClasseStrategy {
    override fun calcularPV(nivel: Int, modificadorConstituicao: Int): Int {
        return (10 * nivel) + (modificadorConstituicao * nivel)
    }

    override fun atacar(modificadorForca: Int, nivel: Int): Int {
        return (1 + nivel/2) + modificadorForca
    }
}

