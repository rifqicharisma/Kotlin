package ControlFlow

fun main(){
    // continue
    val listOfInt = listOf(1,2,3, null, 5, null, 7)

    for (i in listOfInt){
        if (i == null) continue
        println(i)
    }
    // brek
    for (j in listOfInt){
        if (j == null) break
        println(j)
    }
    // melabeli sebuah expression
    looping@ for (k in 1..10){
        println("Outside loop")
        for (l in 1..10){
            println("Inside loop")
            if (l > 5) break@looping
        }
    }
}