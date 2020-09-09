package ControlFlow

fun main(){
    // cara pertama untuk membuat range
    val rangeInt = 1..10
    // untuk mendapatkan step
    println(rangeInt.step)
    // untuk mengubah nilai step
    val range = 1..10 step 3
    range.forEach {
        println("$it ")
    }
    println("With Step " + range.step)
    // operator ... dapat juga diganti dengan rangeTo()
    val rangeint = 1.rangeTo(10)
    // dapat juga menentukan nilai range dengan urutan terbalik
    val downInt = 10.downTo(1)
    // dapat juga memeriksa apakah nilai dari suatu variabel ada pada cakupan tersebut
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne){
        println("value 7 available")
    }
    // dapat juga memeriksa apakah suatu nilai tidak ada dalam suatu range
    val angka = 10.downTo(1)
    if (11 !in angka){
        println("No value 11 in range ")
    }
    // tidak hanya integer, dapat juga dengan tipe data lain
    val rangeChar = 'A'.rangeTo('F')
}