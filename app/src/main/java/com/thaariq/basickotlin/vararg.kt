package com.thaariq.basickotlin

fun main() {
    val number1 = intArrayOf(10,20,30)
    val number = sumNumbers(10, 20, 30, 40, *number1)
    println(number)

    val arrayNumber = arrayOf(1,2,3,4)
    println(sumNumbers(arrayNumber))

    val coba = sumNumbers(100,50,30,20)
    println(coba)
}
//jika memiliki parameter (item didalam tanda kurung) banyak yang bertipe sama, maka gunakan vararg
fun sumNumbers(vararg number: Int):Int {
    return number.sum()
}

//kode tanpa vararg
fun sumNumbers(number: Array<Int>): Int {
    return number.sum()
}
//return ada karena ada integer diluar main function
//".sum" gunanya menambah semua integer
