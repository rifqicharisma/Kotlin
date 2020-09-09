package DataClass

val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
    )
// menampilkan key apa saja yang ada
val mapKeys = capital.keys
// mengetahui nilai apa saja yang ada di dalam map
val mapValues = capital.values
// menambah key-value
val mutableCapital = capital.toMutableMap()
fun main(){
    // cara pertama
    println(capital["Jakarta"])
    // cara kedua
    println(capital.getValue("London"))
    println(mapKeys)
    println(mapValues)
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}