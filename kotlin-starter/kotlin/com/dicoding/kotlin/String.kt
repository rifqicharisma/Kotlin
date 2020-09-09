package com.dicoding.kotlin

fun main(){
    /*
    pada string juga dapat melakukan indexing seperti array
     */
    val text = "Kotlin"
    val firstChar = text[0]
    println("First char of $text is $firstChar")
    /*
    dapat melakukan for-loop
     */
    println()
    for (char in text){
        print("$char ")
    }
    println()
    /*
    mengurangi ambiguitas terhadap penambahan petik dua
     */
    val statement = "Kotlin is \"Awesome!\""
    println(statement)

    // dapat juga menambahkan unicode
    val name = "Unicode test: \u0394"
    println(name)

    // menuliskan multi line
    val line = """
        Line 1
        Line 2
        Line 3
    """.trimIndent()
    print(line)
}