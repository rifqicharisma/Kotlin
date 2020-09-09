package DataClass

data class user(val name: String, val age: Int)
// List
val numberList : List<Int> = listOf(1,2,3,4,5)
// sederhananya
val charList = listOf('a', 'b', 'c')
// jika isinya tipe data yang berbeda, tinggal masukkan saja
val anyList = listOf('a', "kotlin", 3, true)
// dapat memasukkan data class ke dalam list
/*
val anylist = listOf('a', "kotlin", 3, true, User("agus", 18))

 */
// apabila ingin memanipulasi list menggunakan mutableListOf()
val list = mutableListOf('a', "Kotlin", 3, true)
fun main(){
    println(anyList[3])
    list.add('d')
    list.add(1, "Love")
    list[3] = false
}
