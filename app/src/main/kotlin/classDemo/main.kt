package classDemo

// Define a class named Button
// properties that are declared with val are read-only. You can use only getter method
// properties that are declared with var are mutable. You can use both getter and setter methods

// class Button(val label: String, var color: String) {

//     fun click(){
//         println("label is $label, color is $color")
//     }

//     fun soundEffect(){
//         println("Click sound")
//     }
// }


// To make class inheritable, you need to use the open keyword
open class Button(val color : String){
    fun click(){
        println("$color button clicked")
    }

    open fun soundEffect(){
        println("Click sound")
    }
}


// Create a subclass of Button
class DangerousButton(color: String) : Button(color){
    override fun soundEffect(){
        println("Bang!!")
    }
}

// Comparison
class People(val firstName: String, val lastName: String){
    override fun equals(other:Any?) :Boolean {
        if(other == null || other !is People ){
            return false
        }

        return other.firstName == firstName && other.lastName == lastName
    }

    override fun hashCode():Int = firstName.hashCode() * 31 + lastName.hashCode()
}


// fun main(){
//     // Instantiate the Button class
//     val button = Button("Buy me a coffee", "blue")
//     button.click()

//     // getter
//     println("color: ${button.color}")
//     println("label: ${button.label}")

//     // setter
//     button.color = "green"
//     button.click()
// }

// fun main(){
//     val personA = People("John", "Doe")
//     val personB = People("John", "Doe")
    
//     // If you run println, toString() method will be called
//     println(personA)
//     println(personB)

//     // Result: false
//     // By default, Kotlin compares the references of the objects, not the values
//     // If you want to compare the values, you need to override the equals() method

//     // After overriding the equals() method, it will return true
//     print(personA == personB)
// }

// Inheritance
fun main(){
    val button = Button("Green")
    button.click()
    button.soundEffect()
    // Green button clicked
    // Click sound

    val bangButton = DangerousButton("Red")
    bangButton.click()
    bangButton.soundEffect()
    // Red button clicked
    // Bang!!
}