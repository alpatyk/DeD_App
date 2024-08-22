open class Personagem(
    val nome: String,
    val nivel: Int
) {
    open var pv: Int = 0
    var str: Int = (3..18).random()
    var dex: Int = (3..18).random()
    var con: Int = (3..18).random()
    var int: Int = (3..18).random()
    var sab: Int = (3..18).random()
    var car: Int = (3..18).random()

    init {
        // PV base pode ser definido com base na classe posteriormente
        this.pv = calcularPV()
    }

    fun modificadorForca() : Int {
        return (str - 10 ) / 2
    }

    fun modificadorConstituicao(): Int {
        return ( con - 10 ) / 2
    }

    open fun calcularPV(): Int {
        return (10 * nivel)  + (modificadorConstituicao()* nivel)// Placeholder, cada classe pode sobrescrever
    }

    open fun atacar(): Int {
        return (0 + nivel) + modificadorForca()
    }

    fun mostrarStatus() {
        println("Nome: $nome")
        println("Nível: $nivel")
        println("PV: $pv")
        println("Força: $str")
        println("Destreza: $dex")
        println("Constituição: $con")
        println("Inteligência: $int")
        println("Sabedoria: $sab")
        println("Carisma: $car")
    }
}
