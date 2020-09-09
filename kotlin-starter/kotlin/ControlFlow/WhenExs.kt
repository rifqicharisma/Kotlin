package ControlFlow

fun main(){
    // when expresion sama dengan if
    val value = 7
    when(value){
        8 -> println("value is 8")
        7 -> println("Value is 7")
    }
    // kita juga dapat menambahkab else
    val angka = 20
    when(angka){
        7 -> println("Value is 7")
        else -> println("value can't be reached")
    }
    // when dapat menyimpan nilai di dalam variabel
    val nomor = 8
    val stringOfValue = when(nomor){
        6 -> println("Value is 6")
        else -> println("Value can't be reached")
    }
    println(stringOfValue)
    // memungkinkan untuk memeriksa instance dengan tipe data tertentu
    val anyType: Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        else -> println("Undefined")
    }
}