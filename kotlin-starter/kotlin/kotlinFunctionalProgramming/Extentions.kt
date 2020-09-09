package kotlinFunctionalProgramming

fun main(){
    10.printInt()
    println(10.plusThree())
    println(10.slice)
}
fun Int.printInt(){
    println("value $this")
}
//extension function dapat mengembalikan nilai
fun Int.plusThree(): Int{
    return this + 3
}
/*
extensions poperty
 */
val Int.slice: Int
    get() = this / 2