import Raca.Anao
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class racaTest {

    @Test
    fun `test aplicar bonus atributos Anao`() {
        val atributosIniciais = mutableMapOf("str" to 10, "dex" to 10, "con" to 10, "int" to 10, "sab" to 10, "car" to 10)
        val anao = Anao()

        anao.aplicarBonusAtributos(atributosIniciais)

        assertEquals(12, atributosIniciais["con"])
    }
}
