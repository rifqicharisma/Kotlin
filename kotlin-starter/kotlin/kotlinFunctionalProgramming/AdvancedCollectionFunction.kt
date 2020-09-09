package kotlinFunctionalProgramming

fun main(){
    // fungsi fold()
    val numbers = listOf(1,2,3)
    val fold = numbers.fold(10){current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")

    // fungsi DROP -> memangkas item
    val number = listOf(1,2,3,4,5,6)
    val drop = number.drop(3)
    println(drop)

    // fungsi TAKE -> menyaring item
    val total = listOf(1,2,3,4,5,6,7,8,9,10)
    val take = total.take(4)
    println(take)

    // fungsi SLICE -> menyaring item dari posisi tertentu
    val slice = total.slice(3..6)
    println(slice)
        // karena menggunakan range, kita bisa menyematkan step
    val slicing = total.slice(1..10 step 2)

    // fungsi DISTINCT -> menyaring item yang sama
    val angka = listOf(1,2,3,4,4,3,2,1)
    val distinc = angka.distinct()
    println(distinc)
        // menyaring item dengan panjang sama
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGG")
    val distinct = text.distinctBy{
        it.length
    }
    println(distinct)

    // fungsi CHUNKED -> memecah nilai string menjadi beberapa bagian kecil dalam bentuk array
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)
        // memodifikasi nilai yang sudah dipecah menjadi huruf kecil
    val chunkedTransform = word.chunked(3){
        it.toString().toLowerCase()
    }
    println(chunkedTransform)
}