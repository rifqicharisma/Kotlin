package ObjectOrientedProgramming

// deafult modifier pada Kotlin adalah public
// sehingga mendklarasikan class defalut nya adalah public

// private tidak dapat diakses dari luar scope-nya
class Kewan(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean){
    // fungsi getter dan setter
    fun getName() : String{
        return name
    }

    fun setName(newName: String){
        name = newName
    }
}

fun main(){
    val dicodingCat = Kewan("Dicoding miaw", 2.5,2, true)
    //println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    // tidak diizinkan untuk mengakses, harus mendeklarasikan getter dan setter
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}