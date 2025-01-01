// Data class is primary used to hold data.
// It automatically generates equals(), hashCode(), toString(), copy() and componentN() functions.

data class User(val name: String, val age: Int)

val user1 = User("John", 20)
val user2 = User("John", 20)

// Copy method: It is used to create a new object by copying the existing object.
// You can override the properties of the new object.
val user3 = user2.copy(name = "Jane")
println(user1 == user2) // true