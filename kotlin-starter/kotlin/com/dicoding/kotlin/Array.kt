package com.dicoding.kotlin

fun main(){
   // membuat array bisa memanfaatkan library arrayOf()

    val array = arrayOf(1,3,5,7)
    // dapat juga memasukkan nilai dengan tipe data yang berbeda
    val mixArray = arrayOf(1,3,5,7, "Dicoding", true)
    // jika ingin membuat int maka diperlukan tambahan kode
    val intArray = intArrayOf(1,3,5,7)
    print(intArray[2])
    println()
    // dapat juga mengubah nilai array
    var arrayA = intArrayOf(1,2,3,4)
    arrayA[2] = 11
    print(arrayA[2])
}