package ObjectOrientedProgramming

// primary constructor terdapat pada pendeklarasian class animal serta pemanggilannya
/*
Memilih properti yang ingin kita berikan nilai
val dicodingCat = Animal("Dicoding Miaw", 4.2, isMammal =  true)
 */

// membuat verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari nol

class animal(pName: String,
             pWeight: Double,
             pAge: Int,
             pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if (pAge<0) 0 else pAge
        name = pName
        isMammal = pIsMammal

        // jika ingin penamaan yang sama dengan parameter maka menambahkan this
        /*
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
        
         */
    }
}

//  Fungsi init dijalankan ketika suatu objek dibuat dengan menggunakan primary constructor
fun main(){
    val dicodingcat = animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingcat.name}, Berat: ${dicodingcat.weight}, Umur: ${dicodingcat.age}, mamalia: ${dicodingcat.isMammal}")
}