package acuario

fun construirAcuario() {
    // Crear acuario básico y probar cambios
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()
    miAcuario.alto = 60
    miAcuario.imprimirTamano()

    println("---")

    // Probar diferentes constructores
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    // altura y largo por defecto
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    // ancho por defecto
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    // todo personalizado
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    println("---")

    // Constructor secundario con número de peces
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    println("---")

    // Probar setter de volumen
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    println("---")

    // Probar acuario rectangular
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    println("---")

    // Probar herencia con TanqueTorre
    val miAcuarioRect = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuarioRect.imprimirTamano()

    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun main() {
    construirAcuario()
}