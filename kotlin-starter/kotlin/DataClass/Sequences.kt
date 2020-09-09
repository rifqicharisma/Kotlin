package DataClass

fun main(){
    /*
    // menerapkan lazy evaluation
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it)}
     */
    val sequenceNumber = generateSequence(1){it + 1} // infinite loop
    sequenceNumber.take(5).forEach { println("$it ") }
}