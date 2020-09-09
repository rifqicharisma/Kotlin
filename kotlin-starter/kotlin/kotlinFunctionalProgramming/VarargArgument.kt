package kotlinFunctionalProgramming

fun main(){
    // melampirkan beberapa argumen
    val number = sumNumbers(10,20,30,40)
    println(number)
    // mengetahui jumlah argumen
    val nomor = numbers(1,2,3,4,5,6)
    println(nomor)
}
// menyederhanakan parameter yang bertipe data sama
fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}
fun numbers(vararg angka: Int): Int{
    return angka.size
}