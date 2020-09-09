package ObjectOrientedProgramming

fun main(){
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())
    // dapat juga mengubah tipe data dengan mengakses fungsi yang tersedia
    val stringSome = "123"
    val someInt = stringSome.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()
    println(someInt is Int)
    println(someDouble is Double)
}