package com.dicoding.kotlin

fun main(){
 val user = setUser("Rifqi", 19)
    println(user)
    printUser("Alfian", 18)

}
/*
cara menuliskan sebuah fungsi diikuti dengan nilai kembalian yaitu String
 */
fun setUser(name: String, age: Int): String{
    return "Your name is $name and you $age years old"
}
// jika tidak ingin mengembalikan sebuah nilai maka bisa menggunakan Unit
fun printUser(name: String, age: Int): Unit{
    println("Your name is $name")
}