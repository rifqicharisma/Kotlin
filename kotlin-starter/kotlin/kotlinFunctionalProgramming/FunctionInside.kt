package kotlinFunctionalProgramming

fun main(){

}

fun setWord(message: String){
    fun printMessage(text: String){
        println(text)
    }

    println(message)
}

// kegunaannya adalah agar tidak mengulangi kode yang sama
fun sum(valueA: Int, valueB: Int, valueC: Int): Int{
    fun validateNumber(value: Int){
        if (value == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)
    return valueA+valueB
}