package com.dicoding.kotlin

fun main(){
    val openHours = 7
    val now = 20
    val office: String  // harus diinisialisasi tipe datanya
    if (now > openHours){
        office = "Office already open"
    }else{
        office = "Office is closed"
    }
    println(office)
    /*
    dapat juga disimpan di dalam variabel
     */
    val open = 7
    val nowe = 7
    val offices: String
    offices = if(nowe > open){
        "Office already open"
    }else if(nowe == open){
        "Wait for a minute"
    }else{
        "Office is closed"
    }
    print(offices)
}