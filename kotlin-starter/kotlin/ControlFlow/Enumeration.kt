package ControlFlow


fun main(){
    // contoh sederhana enumeration
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue : Color = Color.BLUE
    // mendapatkan daftar objek
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }
    // mendapatkan nama objek
    val color: Color = Color.valueOf("RED")
    println("Color is $color")
    // mendapatkan daftar objek yang lebih umum
    val colore: Array<Color> = enumValues()
    colore.forEach { color ->
        println(color)
    }
    // mendapatkan nama objek yang lebih umum
    val coloray: Color = enumValueOf("RED")
    println("Color is $coloray")
    // mendapatkan posisi dari tiap objek
    val colorr: Color = Color.GREEN
    println("Position GREEN is ${colorr.ordinal}")
    // mengecek instance dari enum
    when(colorr){
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Colot is Blue")
        Color.GREEN -> println("Color is GREEN")
    }
}
enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FFF)
}