fun doSomething(vararg input: Int): Int {
    return (input.sum() / input.size)
}

fun main(){
    val result = doSomething(1, 2, 3, 4, 5)
    print(result)
}
