package Classes

class ClerigoStrategy : ClasseStrategy{
    override fun calcularPV(nivel: Int, modificadorConstituicao: Int): Int {
        return (8 * nivel) + (modificadorConstituicao * nivel)
    }

    override fun atacar(modificadorForca: Int, nivel: Int): Int {
        return (1 + nivel/4) + modificadorForca
    }
}