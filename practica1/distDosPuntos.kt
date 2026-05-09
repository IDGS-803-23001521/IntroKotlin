//Calcular la distancia entre dos puntos
import kotlin.math.pow 

fun main() {

    println("Ingrese la primer coordenada 'x'")
    val x1 = readln().toInt()

    println("Ingrese la primer coordenada 'y'")
    val y1 = readln().toInt()

    println("Ingrese la segunda coordenada 'x'")
    val x2 = readln().toInt()

    println("Ingrese la segunda coordenada 'y'")
    val y2 = readln().toInt()

    val distancia = ((x2 - x1).pow(2) + (y2 - y1).pow(2)).pow(0.5)

    println("La distancia es: $distancia")
}