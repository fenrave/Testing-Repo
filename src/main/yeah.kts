import kotlin.math.roundToInt

fun circum(number1: Double): Int {
    var num: Double = (Math.pow(number1,2.0) * Math.PI)
    return num.roundToInt()
}

fun main() {
    println(circum(2.0))
}

main()