package kotlinFunctionalProgramming

fun main() {
// >> Lambda Receiver
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    // >> Lambda Argumen
    val text = "Hello"
    text.let{
        val message = "$it Kotlin"
        println(message)
    }

    // >> RUN
    val result = text.run{
        val from = this
        val to= this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    // >> WITH
    val message = "Hello Kotlin!"
    val resultt = with(message){
        println("Value is $this")
        println("with length ${this.length}")
    }

    // >> APPLY
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
    println(builder.toString())
        // jika ditulis dengan apply
    val messages = StringBuilder().apply{
        append("Hello ")
        append("Kotlin!")
    }
    println(messages.toString())

    // >> LET
    val messagess: String? = null
    messagess?.let{
        val length = it.length * 2
        val text = "Text length $length"
        println(text)
    }
        // jika objek bernilai null
    val pesan: String? = null
    pesan?.let{
        val panjang = it.length * 2
        val tulisan = "text length $panjang"
    }.run{
        val tulisan = "message is null"
        println(tulisan)
    }

    // >> ALSO
    val tulisan2 = "Hello Kotlin"
    val result1 = tulisan2.also { 
        println("value length -> ${it. length}")
    }
    println("text -> $result1")
}
