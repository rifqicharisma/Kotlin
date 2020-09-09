package kotlinFunctionalProgramming

fun main(){
    message()
    pesan("Hello from lambda")
    val length = messageLength("Hello from lambda")
    println("Message length $length")
}

val message = { println("Hello from lambda")}
// menambahkan sebuah parameter dalam lambda
val pesan = {pesan: String -> println(pesan)}
// agar dapat mengembalikan nilai
val messageLength = {text: String -> text.length}