open class Personagem(
    val nome: String,
    val nivel: Int
) {
    open var pv: Int = 0
    var str: Int = 0
    var dex: Int = 0
    var con: Int = 0
    var int: Int = 0
    var sab: Int = 0
    var car: Int = 0

    init {
        // Escolher método de criação de atributos
        escolherMetodoDeAtributos()
        // Calcular PV baseado na classe
        this.pv = calcularPV()
    }

    // Função para escolher o método de criação de atributos
    fun escolherMetodoDeAtributos() {
        println("Escolha o método de criação de atributos:")
        println("1. Atributos aleatórios (3 a 18)")
        println("2. Sistema de pontos (começa com 8 em cada atributo e 27 pontos para distribuir)")

        when (readLine()?.toIntOrNull()) {
            1 -> atribuirAtributosAleatorios()
            2 -> distribuirPontos()
            else -> {
                println("Escolha inválida, aplicando atributos aleatórios por padrão.")
                atribuirAtributosAleatorios()
            }
        }
    }

    // Método 1: Atribuir valores aleatórios entre 3 e 18
    fun atribuirAtributosAleatorios() {
        str = (3..18).random()
        dex = (3..18).random()
        con = (3..18).random()
        int = (3..18).random()
        sab = (3..18).random()
        car = (3..18).random()
        println("Atributos gerados aleatoriamente: STR: $str, DEX: $dex, CON: $con, INT: $int, SAB: $sab, CAR: $car")
    }

    // Método 2: Sistema de pontos com 27 pontos para distribuir
    fun distribuirPontos() {
        var pontosRestantes = 27

        // Todos os atributos começam em 8
        str = 8
        dex = 8
        con = 8
        int = 8
        sab = 8
        car = 8

        val atributos = mutableMapOf("str" to ::str, "dex" to ::dex, "con" to ::con, "int" to ::int, "sab" to ::sab, "car" to ::car)

        println("Você tem $pontosRestantes pontos para distribuir. Lembre-se, atributos acima de 15 custam 2 pontos adicionais.")
        while (pontosRestantes > 0) {
            println("Atributos atuais: STR: $str, DEX: $dex, CON: $con, INT: $int, SAB: $sab, CAR: $car")
            println("Pontos restantes: $pontosRestantes")
            println("Escolha o atributo para aumentar (Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma):")
            val escolha = readLine()?.capitalize() ?: ""

            if (escolha in atributos.keys) {
                val atributoRef = atributos[escolha] ?: continue
                val custo = if (atributoRef.get() >= 15) 2 else 1

                if (pontosRestantes >= custo) {
                    atributoRef.set(atributoRef.get() + 1)
                    pontosRestantes -= custo
                } else {
                    println("Você não tem pontos suficientes para aumentar esse atributo.")
                }
            } else {
                println("Escolha inválida, tente novamente.")
            }
        }

        println("Distribuição final de atributos: STR: $str, DEX: $dex, CON: $con, INT: $int, SAB: $sab, CAR: $car")
    }

    // Modificador de Força
    fun modificadorForca(): Int {
        return (str - 10) / 2
    }

    // Modificador de Constituição
    fun modificadorConstituicao(): Int {
        return (con - 10) / 2
    }

    // Função para calcular PV com base no nível e Constituição
    open fun calcularPV(): Int {
        return (10 * nivel) + (modificadorConstituicao() * nivel)
    }

    // Função de ataque que considera o modificador de Força
    open fun atacar(): Int {
        return nivel + modificadorForca()
    }

    // Mostrar status do personagem
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
