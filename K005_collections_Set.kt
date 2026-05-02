import java.util.TreeSet

fun main(){


    // Set is a collection that contains no duplicate elements. It is an unordered collection, meaning that the elements are not stored in any particular order. Sets are useful when you want to ensure that there are no duplicate values in a collection.
    val a = setOf(1, 2, 3) //immutable set
    val b = setOf(4, 3,2, 5).sortedBy {it }
    print(b)

//    a.add(4) (NA) Error: Unresolved reference: add

    val union = a union b // [1, 2, 3, 4, 5]
    val intersection = a intersect b // [3]
    val diff = a subtract b // [1, 2]

    //Mutable Set
    val c = mutableSetOf(1, 2, 3)
    c.add(4) // [1, 2, 3, 4]



    val set = TreeSet(compareBy<String> { it.length })
    set.addAll(listOf("apple", "kiwi", "banana"))

    println(set)
}



//| Feature      | HashSet ⚡  | LinkedHashSet 🔗   | TreeSet 🌳     |
//| ------------ | ---------- | ------------------ | -------------- |
//| Order        | ❌ No       | ✔️ Insertion       | ✔️ Sorted      |
//| Performance  | ⚡ Fast     | ⚡ Slightly less    | 🐢 Slower      |
//| Structure    | Hash Table | Hash + Linked List | Red-Black Tree |
//| Null allowed | ✔️ Yes     | ✔️ Yes             | ❌ No           |


//mutableSetOf() → returns LinkedHashSet by default in Kotlin
//setOf() → read-only but still backed by optimized implementations
//TreeSet is not native Kotlin → imported from Java