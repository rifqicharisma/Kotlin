package DataClass

fun main(){
    // memfilter data sesuai kondisi yang diberikan
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList)
    // memfilter sesuai kondisi yang tak sesuai
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)

    // membuat collection baru sesuai perubahan yang dilakukan
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)

    // menghitung jumlah item yang ada di dalam collection
    println(numberList.count())
    // dapat juga disisipi untuk mengitung sesuai kondisi yang diberikan
    val number = listOf(1,2,3,4,5,6,7)
    println(number.count { it % 3 == 0 })

    // mencari item pada sebuah collection
    val fistOddNumber = numberList.find { it % 2 == 1 }
    println(fistOddNumber)

    // fungsi menjumlahkan sebuah data
    val total = numberList.sum()
    println(total)

    // mengurutkan data
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}