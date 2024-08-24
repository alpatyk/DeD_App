package Classes

class LadinoStrategy : ClasseStrategy{
    override fun calcularPV(nivel: Int, modificadorConstituicao: Int): Int {
        return (6 * nivel) + (modificadorConstituicao * nivel)
    }

    override fun atacar(modificadorForca: Int, nivel: Int): Int {
        return (0 + nivel/3) + modificadorForca
    }
}