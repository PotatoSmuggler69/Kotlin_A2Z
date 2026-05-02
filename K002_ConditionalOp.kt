fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    val weather = a >24

    // Using if-else as an expression
    val max = if (a > b) a else b
    println("The maximum value is: $max")

    // Using when as an expression
    val result = when {
        a > b -> "a is greater than b"
        a < b -> "a is less than b"
        a == b -> "a and b are equal"
        else -> "Unexpected case"
    }
    println(result)
}

class K002_ConditionalOp
