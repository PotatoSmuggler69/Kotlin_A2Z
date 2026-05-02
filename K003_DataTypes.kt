import java.awt.image.DataBufferDouble

fun main () {
//    var a : Double = readln().toDouble()
//    var b : Int = readln().toInt()


//    var a : Float = readln().toFloat()
//    var b : Int = readln().toInt()

    var a: Double = readln().toDouble()
    var b: Double = readln().toDouble()
    println("Enter any symbol to perform operation(+,-,*,/)")
    var symbol = readln()
    var result : Double

    if (symbol == "+") {
         result = a + b
        println("Answer is $result")
    } else if (symbol == "-") {
         result = a - b
        println("Answer is $result")
    } else if (symbol == "*") {
         result = a * b
        println("Answer is $result")
    } else if (symbol == "/") {
         result = a / b
        println("Answer is $result")
    }
}