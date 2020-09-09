package kotlinFunctionalProgramming

fun main(){
    val value: Int? = null
    println(value.slice)
}

// elvis operator
val Int?.slice: Int
    get() = this?.div(2) ?:0