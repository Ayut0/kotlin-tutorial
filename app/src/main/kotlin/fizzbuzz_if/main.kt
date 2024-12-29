package fizzbuzz_if

fun fizzbuzz(i:Int) : String {
    return if(i % 15 == 0){
        "FizzBuzz"
    } else if(i % 3 ==0){
        "Fizz"
    } else if(i % 5 == 0){
        "Buzz"
    } else {
        "$i"
    }
}

fun main() {
    for(i in 1..100){
        println(fizzbuzz(i))
    }
}