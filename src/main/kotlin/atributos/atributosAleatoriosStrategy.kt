package atributos

class atributosAleatoriosStrategy : atributoStrategy{
    override fun gerarAtributos(): Map<String, Int> {
        return mapOf(
            "str" to (3..18).random(),
            "dex" to (3..18).random(),
            "con" to (3..18).random(),
            "int" to (3..18).random(),
            "sab" to (3..18).random(),
            "car" to (3..18).random(),
        )
    }
}