// Multiplicación usuando sumas 

fun main() {

    println("Ingrese el primer numero")
    val num1 = readln().toInt()

    println("Ingrese el segundo numero")
    val num2 = readln().toInt()

    var resultado = 0

    for (i in 1..num2) {
        resultado = resultado + num1
    }

    println("La multiplicacion es: $resultado")
}