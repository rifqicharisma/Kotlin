package com.dicoding.kotlin

fun main(){
   // var dapat mengubah nilai variabel
    var company: String = "Dicoding" // boleh menuliskan tipe data atau tidak
    company = "Dicoding academy"
    println(company)
    /*
    sedangkan val tidak bisa mengubah nilai yang sudah diberikan
    val company: String = "Dicoding"
    company = "Dicoding academy"
     */
    println()
    val firstWord = "Dicoding"
    val lastWorld = " Academy"
    print(firstWord + lastWorld)
    println()
    // berbeda dengan int penggunaan tanda + akan menambah nilai dari int
    val valueA: Int = 10
    val valueB: Int = 20
    print(valueA + valueB)
}