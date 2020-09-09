package kotlinFunctionalProgramming

fun getFullName(first: String, middle: String, last: String): String{
    return "$first $middle $last"
}

fun main(){
    val fullName = getFullName(first = "Kotlin", middle = " is ", last = "Awesome")
    println(fullName)

    // dapat mengubah posisi argumen
    val name = getFullName(middle = " is ", first = "Kotlin", last = "Awesome")
    println(name)
}