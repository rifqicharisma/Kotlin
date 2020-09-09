package kotlinFunctionalProgramming

fun main() {

    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
    // membuat instance dari function
    val sumResult = sum.invoke(10,10)
    val multiplyResult = multiply.invoke(20,20)
    // dapat juga menulis langsung dengan menghapus invoke
    val summ = sum(10,10)
    val multipyy = multiply(20,20)
}
// menyederhanakan fungsi
typealias Arithmetic = (Int, Int) -> Int