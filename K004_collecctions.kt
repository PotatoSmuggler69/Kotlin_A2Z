fun main(){

    // Iterable
//   ├─ Collection (read-only)
//   │    ├─ List
//   │    └─ Set
//   └─ MutableCollection
//        ├─ MutableList
//        └─ MutableSet
//
// Map (separate hierarchy)
//   └─ MutableMap

    // List
    val myList: List<String> = listOf("Apple", "Banana", "Cherry")
    println(myList) // Output: [Apple, Banana, Cherry]

    // Set
    val mySet: Set<String> = setOf("Apple", "Banana", "Cherry")
    println(mySet) // Output: [Apple, Banana, Cherry]

    // Map
    val myMap: Map<String, Int> = mapOf("Apple" to 2, "Banana" to 2, "Cherry" to 3)
    println(myMap) // Output: {Apple=1, Banana=2, Cherry=3}

}