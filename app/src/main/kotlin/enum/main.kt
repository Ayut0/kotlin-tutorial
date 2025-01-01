package colorgenerator

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

// sealed class
// It allows you to restrict its inheritance and add new subclasses.
sealed class Expr {
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()

    // If you add a new subclass. you'll get a compile error
    // class Sub(val left: Expr, val right: Expr): Expr()
}

fun eval(e:Expr): Int =
    when(e){
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

// enum and when expression make compiler check all cases
fun getJapaneseColor(color:Color) =
    when(color){
        Color.RED -> "赤"
        Color.ORANGE -> "オレンジ"
        Color.YELLOW -> "黄"
        Color.GREEN -> "緑"
        Color.BLUE -> "青"
        Color.INDIGO -> "藍"
        Color.VIOLET -> "紫"
    }

fun main() {
    println(getJapaneseColor(Color.RED))
    println(getJapaneseColor(Color.ORANGE))
    println(getJapaneseColor(Color.YELLOW))
    println(getJapaneseColor(Color.GREEN))
    println(getJapaneseColor(Color.BLUE))
    println(getJapaneseColor(Color.INDIGO))
    println(getJapaneseColor(Color.VIOLET))

    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}