package ObjectOrientedProgramming

class Binatang{
    var name: String = "Dicoding Miaw"
    get(){
        println("Fungsi getter terpanggil")
        return field
    }
    set(value) {
        println("Fungsi Setter terpanggil")
        field = value
    }
}

fun main(){
    val dicodingCat = Binatang()
    println("Nama : ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama : ${dicodingCat.name}")
}