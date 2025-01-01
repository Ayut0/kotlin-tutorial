package collection_practice

fun double_list():List<Int> {
    val list = listOf(1,2,3)
    // list.forEach{ num -> println(num * 2)}

    // You can simplify that expression by using the it keyword
    // list.forEach{ println(it * 2)}

    // map method
    list.map{it * 2}.forEach { println(it) }
    return list
}

fun main() {
    double_list()
}