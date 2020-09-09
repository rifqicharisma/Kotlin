package DataClass

data class dataUser(val name: String, val age : Int)
fun main(){
    /*
   val dataUser = dataUser("nrohmen", 17)
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, i am $age years old")

     */
    // membuat beberapa variabel dari objek secara langsung
    val dataUser = dataUser("nrohmen", 17)
    val (name,age) = dataUser
    println("My name is $name, i am $age years old")
}