import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import atributos.atributosAleatoriosStrategy
import atributos.DistribuicaoPontosStrategy

class AtributosStrategyTest {

    @Test
    fun `test gerar atributos aleatorios`() {
        val estrategiaAleatoria = atributosAleatoriosStrategy()
        val atributos = estrategiaAleatoria.gerarAtributos()

        assertTrue(atributos["str"] in 3..18)
        assertTrue(atributos["dex"] in 3..18)
        assertTrue(atributos["con"] in 3..18)
    }

    @Test
    fun `test gerar atributos distribuidos`() {
        val estrategiaDistribuida = DistribuicaoPontosStrategy()
        val atributos = estrategiaDistribuida.gerarAtributos()

        assertEquals(27, atributos.values.sum() - (6 * 8)) // Verifica que os pontos alocados somam 27
        assertTrue(atributos.values.all { it >= 8 }) // Todos começam em 8
    }
}
