package com.dicoding.kotlin

fun main(){
    /*
    string template digunakan untuk menyisipkan sebuah variabel ke dalam sebuah string
     */
    val name = "Kotlin"
    println("Hello My Name is $name")
    // tidak hanya string tetapi tipe data lain dapat dimasukkan
    val tinggi = 10
    val lebar = 20.0
    val panjang = 1_00
    println("Kolam renang itu mempunyai panjang $panjang, lebar $lebar, dan tinggi $tinggi")
    // dapat juga menyisipkan sebuah expression
    val hour = 7
    println("Office ${if (hour > 7) "Already close" else "Is Open"}")
}