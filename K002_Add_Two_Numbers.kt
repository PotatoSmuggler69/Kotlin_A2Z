import javax.imageio.stream.ImageInputStream

fun main(){
//    val a : Int? = readLine()?.toInt()
//    val b : Int? = readLine()?.toInt()
//
//if (a!=null && b!=null) println("sum is =  ${a+b}")
//    else println("a or b is null")
//
//    //print(sum.javaClass) //get datatype of any varibale`
//
//    //null and type check
//    val x : Int? = readln().toInt()


    val x: Any? = 3

    when (x) {
        null -> println("x is null")
        is Int -> println("x is Int")
        is String -> println("x is String")
        else -> println("Unknown type")
    }

    println("Enter total seconds:")
    val toatlSec = readLine()?.toIntOrNull() ?: 0
    val hours = toatlSec / 3600
    val minutes = (toatlSec % 3600) / 60
    val seconds = toatlSec % 60
    println("$hours:$minutes:$seconds")
}