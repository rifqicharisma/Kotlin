package kotlinFunctionalProgramming

fun main() {
    printlnResult(10, sum)
    // dapat melampirkan lambda secara langsung
    printlnResult(10){value -> value + value}

    val message = buildString {
        append("Hello ")
        append("from ")
        append("lamnda ")
    }
    println(message)
}

fun printlnResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

// Konsep Lambda with Receiver
fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return action.toString()
}