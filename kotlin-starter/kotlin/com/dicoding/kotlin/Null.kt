package com.dicoding.kotlin

fun main(){
   // jika ingin objek bernilai null maka bisa menambahkan tanda tanya
    val text: String? = null
    /*
    namun kita tidak dapat mengakses variabel tersebut
    cara menanganinya adalah kita periksa apakah bernilai null
    atau tidak
     */
    if (text != null){
        val textLenght = text.length
    }
    /*
    cara penanganan Nullabel dengan Safe Calls dan Elvis Operator
     */
    val tulis: String? = null
    tulis?.length // kompiler akan melewatkan proses jika objek bernilai null
    println(tulis)

    // cara elvis operator
    val tulisan: String? = null
    val TextLenght = text?.length ?: 7 // jika objek bernilai null, maka akan mengembalikan nilai 7 atau default value
    println(TextLenght)

}