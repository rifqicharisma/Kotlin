package com.dicoding.kotlin

fun main(){
    // mengetahui nilai maximal numerik menggunakan MAX_VALUE
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(maxInt)
    println(minInt)
    val one: Float = 10F
    val two: Float = 3F
    println(one / two)
    val a: Double = 8.0
    val b: Double = 5.0
    println(a/b)
    // cara mengkonversi
    val byteNumber: Double = 10.0
    val intNumber: Int = byteNumber.toInt()
    println(intNumber)
    // cara lain
    val stringNumber = "10"
    val intAngka = 20
    println(intAngka + stringNumber.toInt())
    // dapat menuliskan numerik yang readable menggunakan underscore
    val readableNumber = 1_000_000
    println(readableNumber)
}