// Singleton object
// Singleton object ensures that a class has only one instance and provides a global point of access to it.
// Usage: Shared resources, Database connections, Logger, File system, etc.

object Red {
    fun getRbg() :String{
        return "rgb(255,0,0)"
    }

    fun getHex():String{
        return "#FF0000"
    }
}

// Companion object
// It's used to create Factory methods in Kotlin.
// Factory methods are those methods that return an instance of the class.
class MyClass {
    companion object Factory{
        fun create(): MyClass = MyClass()
    }
}

// Private constructor makes instances cannot be created outside the class.
class PointXY private constructor(val x: Int, val y: Int){
    companion object  {
        fun create(x: Int, y: Int): PointXY {
            return PointXY(x, y)
        }
    }
}

fun main(){
    println(Red.getRbg())
    println(Red.getHex())
    println(PointXY.create(1, 2))
}