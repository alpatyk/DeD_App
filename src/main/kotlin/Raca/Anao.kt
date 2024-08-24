package Raca

class Anao : Raca{
    override fun aplicarBonusAtributos(atributos: MutableMap<String, Int>) {
        atributos["con"] = (atributos["con"] ?: 0) + 2 // Elfos recebem +2 em Destreza
    }
}