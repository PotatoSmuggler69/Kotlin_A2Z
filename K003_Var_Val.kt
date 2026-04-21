/*
In Kotlin, there are two types of variables: `var` and `val`.
    1. 'var' (variable)
        - A variable declared with `var` can be reassigned to a different value.
        - It is mutable, meaning you can change its value after it has been initialized.
        - Example:
            var name = "Alice"
            name = "Bob" // This is allowed
    2. 'val' (value)
        - A variable declared with `val` cannot be reassigned after it has been initialized.
        - It is immutable, meaning once you assign a value to it, you cannot change it.
        - Example:
            val name = "Alice"
            name = "Bob" // This will cause a compilation error

    val is like a final variable in Java, while var is like a regular variable that can be changed.


*/

fun main() {
    print("Hello")
    var name = "Alice"
    println(name) // Output: Alice

    val pi = 3.14
    println(pi) // Output: 3.14


    // How to assign a new value to a var variable
    var first_name = "Navneet" // Dynamically typed variable
    var surname : String= "Yadav" // Statically typed variable
    println(first_name + " " + surname) // Output: Alice Smith
}

