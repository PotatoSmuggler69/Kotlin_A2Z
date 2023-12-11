fun main(){
    print("Enter the number 1: ")
    val a : Int? = readLine()?.toInt()
    print("Enter the numebr 2 : ")
    val b: Int? = readLine()?.toInt()

    if(a!=null && b!=null)   sum(a,b)
}

fun sum(a: Int?,b: Int?){
    if(a!=null && b!=null) print("The sum is ${a+b}")
    else print("Enter correct data")
}