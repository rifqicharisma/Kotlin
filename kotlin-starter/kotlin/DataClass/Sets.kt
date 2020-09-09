package DataClass
/*
menghapus nilai yang sama
 */
// mendeklarasikan set
val integerSet = setOf(1,2,4,2,1,5)
// fungsi union dan intersect atau gabungan dari 2 set
val setA = setOf(1, 2, 4, 2, 1, 5)
val setB = setOf(1, 2, 4, 5)
val setC = setOf(1,5,7)
val union = setA.union(setC)
val intersect = setA.intersect(setC)

fun main(){
    println(integerSet)
    // chek apakah sebuah nilai berada di set atau tidak
    println(5 in integerSet)

    println(union)
    println(intersect)
    /*
        pada set kita bisa menambah atau menghapus nilai
        tapi tidak bisa mengubah nilai
 */
}