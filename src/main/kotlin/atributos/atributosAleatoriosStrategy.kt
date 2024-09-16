package atributos

class atributosAleatoriosStrategy : atributoStrategy{
    override fun gerarAtributos(): Map<String, Int> {
        return mapOf(
            "str" to (3..15).random(),
            "dex" to (3..15).random(),
            "con" to (3..15).random(),
            "int" to (3..15).random(),
            "sab" to (3..15).random(),
            "car" to (3..15).random(),
        )
    }
}