package ControlFlow

fun main(){
    // cara menggunakan for pada ranges
    val ranges = 1..5
    for (i in ranges){
        println("Value is $i")
    }
    // cara kedua
    val range = 1.rangeTo(5)
    for (i in range){
        println("Value is $i")
    }
    // cara lompatan
    val rang = 1.rangeTo(10) step 3
    for (i in rang){
        println("Value is $i")
    }
    // dapat juga mengakses indeks dari tiap elemen
    val angka = 1.rangeTo(10) step 3
    for ((index, value) in angka.withIndex()){
        println("Value $value with index $index")
    }
    // dapat juga menggunakan forEach
    val mulai = 1.rangeTo(10) step 3
    mulai.forEach{value ->
        println("Value is $value")
    }
    // akses indeks pada forEach
    mulai.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}