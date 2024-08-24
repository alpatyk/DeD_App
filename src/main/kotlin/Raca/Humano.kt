package Raca

class Humano : Raca{
    override fun aplicarBonusAtributos(atributos: MutableMap<String, Int>) {
        atributos["str"] = (atributos["str"] ?: 0) + 1
        atributos["dex"] = (atributos["dex"] ?: 0) + 1
        atributos["con"] = (atributos["con"] ?: 0) + 1
        atributos["int"] = (atributos["int"] ?: 0) + 1
        atributos["sab"] = (atributos["sab"] ?: 0) + 1
        atributos["car"] = (atributos["car"] ?: 0) + 1
    }
}