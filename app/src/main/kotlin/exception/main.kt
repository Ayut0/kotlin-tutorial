package exception
import java.lang.IllegalArgumentException

// Basic syntax for exception handling in Kotlin
fun throwPercentageException(percentage:Int){
    if(percentage !in 0..100){
        throw IllegalArgumentException("Percentage must be between 0 and 100: $percentage")
    }else {
        println("Percentage is $percentage")
    }
}

class ConvertFun {
// try-catch-finally in formula
    fun convertStrToInt(str: String){
      val num = try{
        str.toInt()
      } catch(e:NumberFormatException){
        return
      }finally{
        println("Finally block")
      }

    println("Number is $num")
  }

  }

fun main() {
     try {
         throwPercentageException(20)
     } catch (e: IllegalArgumentException) {
         println(e.message)
     }finally {
         println("This is the finally block")
     }
}