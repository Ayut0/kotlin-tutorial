package collections

// List
// Immutable list
val immutableNumbers = listOf("one", "two", "three", "four", "five")

// How to access elements in a list
//println(numbers.get(2))
// three
//println(numbers[2])
// three

// How to grab the length of a list
//println(numbers.size) // 5

// How to check if a list is empty
//println(numbers.isEmpty()) // false

// mutable list
val mutableNumbers = mutableListOf("one", "two", "three", "four", "five")
//numbers.addO\("six") // ["one", "two", "three", "four", "five", "six"]
//numbers.removeAt(1) // ["one", "three", "four", "five", "six"]
//numbers[0] = "zero" // ["zero", "three", "four", "five", "six"]

// Set
// Immutable set
val immutableSetOfNumbers = setOf(1,2,3,4)
// if(setNumbers.contains(1)){
//     println("1 is in the set")
// }

// Mutable set
val mutableSetOfNumbers = mutableSetOf(1,2,3,4)
//numbers.add(5) // [1,2,3,4,5]
//numbers.remove(1) // [2,3,4,5]

// Map: key-value pairs
// Immutable map
val immutableNumbersMap = mapOf("one" to 1, "two" to 2, "three" to 3) // {one=1, two=2, three=3}
//println(immutableNumbersMap.get("key1")) // 1
// It returns null if you try to access a key that doesn't exist
//println(immutableNumbersMap.get("key0")) // null

// Mutable map
val mutableNumbersMap = mutableMapOf("one" to 1, "two" to 2)
//mutableNumbersMap.put("three", 3) // {one=1, two=2, three=3}
//mutableNumbersMap["one"] = 10 // {one=10, two=2, three=3}


fun printDoubledList():List<Int> {
    val list = listOf(1,2,3)
    // list.forEach{ num -> println(num * 2)}

    // You can simplify that expression by using the it keyword.
    // list.forEach{ println(it * 2)}

    // map method
    list.map{it * 2}.forEach { println(it) }
    return list
}

fun main() {
    printDoubledList()
}