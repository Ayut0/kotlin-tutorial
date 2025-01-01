package interface

interface Clickable{
    fun click()
}

class Button:Clickable{
    override fun click() = println("Button clicked")
}

fun main(){
    val button = Button()
    button.click()
}