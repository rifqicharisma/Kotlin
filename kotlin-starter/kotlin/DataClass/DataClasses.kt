package DataClass

class User(val name: String, val age: Int)

data class DataUser(val name: String, val age : Int)
fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    println(user)
    println(dataUser)
    println()
    // memiliki equals secara otomatis
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("nrohmen", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    // menyalin sebuah objek dengan mudah
    val dataUser4 = dataUser.copy()
    println(dataUser4)
    // dapat juga memodifikasi objek
    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5)
}