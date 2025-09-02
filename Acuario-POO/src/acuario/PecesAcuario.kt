package acuario

// Clase abstracta Pez
abstract class Pez {
    abstract val color: String
}

// Interfaz AccionPez
interface AccionPez {
    fun comer()
}

// Clase Tiburón que hereda de Pez e implementa AccionPez
class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"

    override fun comer() {
        println("cazar y comer peces")
    }
}

// Clase PezPayaso que hereda de Pez e implementa AccionPez
class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"

    override fun comer() {
        println("comer algas")
    }
}