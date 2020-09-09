package com.dicoding.kotlin

fun main(){
    val open = 7
    val closed = 8
    val now = 20

    val isOpen = if (now >= open && now <=closed){
        true
    }else{
        false
    }
    println("Office is open: $isOpen")
}