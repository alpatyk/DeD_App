package Classes

interface ClasseStrategy {
    fun calcularPV(nivel: Int, modificadorConstituicao: Int): Int
    fun atacar(modificadorForca: Int, nivel: Int): Int
}
