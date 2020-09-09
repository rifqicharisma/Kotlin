package kotlinFunctionalProgramming

//var message = "Kotlin"
fun main(){
    val sum: (Int, Int) -> Int = ::count

    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
    // mereferensikan sebuah extentions function
    val EvenNumbers = numbers.filter(Int::isEvennumber)
    // Properti References
    /*
    println(::message.name)
    println(::message.get())
    ::message.set("Kotlin Academy")
    println(::message.get())

     */
}
// memisahkan lambda expression menjadi fungsi tersendiri
fun count(valueA: Int, valueB: Int):Int {
    return valueA + valueB
}
// function references
fun isEvenNumber(number: Int) = number % 2 == 0
fun Int.isEvennumber() = this % 2 == 0