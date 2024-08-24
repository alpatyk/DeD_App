package Raca

class Elfo : Raca{
    override fun aplicarBonusAtributos(atributos: MutableMap<String, Int>) {
        atributos["dex"] = (atributos["dex"] ?: 0) + 2 // Elfos recebem +2 em Destreza
    }
}