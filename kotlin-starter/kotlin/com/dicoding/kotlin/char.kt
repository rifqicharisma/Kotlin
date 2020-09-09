package com.dicoding.kotlin

fun main(){
    // char hanya dapat merepresentasikan 1 huruf saja
    // apabila lebih dari 1 huruf maka akan terjadi eror
    var kata: Char = 'A'
    println("Vocal "+ kata++) // dapat menjalankan operasi increment
    println("Vocal "+ kata++)
    println("Vocal "+ kata++)
    println("Vocal "+ kata--)
    println("Vocal "+ kata--)
    println("Vocal "+ kata--)
}