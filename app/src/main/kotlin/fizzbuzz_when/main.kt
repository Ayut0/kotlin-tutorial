package fizzbuzz_when

fun fizzbuzz(i:Int) :String {
    return  when{
        i % 15 == 0 -> {
            "FizzBuzz"
        }
        i % 3 == 0 -> {
            "Fizz"
        }
        i % 5 ==0 -> {
            "Buzz"
        }
        else -> {
            "$i"
        }
    }
}

fun main() {
    for(i in 1..100){
        println(fizzbuzz(i))
    }
}