package Classes

class MagoStrategy : ClasseStrategy {
    override fun calcularPV(nivel: Int, modificadorConstituicao: Int): Int {
        return (4 * nivel) + (modificadorConstituicao * nivel)
    }

    override fun atacar(modificadorForca: Int, nivel: Int): Int {
        // Magos podem ter um ataque baseado em magia ou outra lógica
        return (0 + nivel/4) + modificadorForca  // Simples exemplo
    }
}