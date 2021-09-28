package com.thaariq.basickotlin.controlflow

fun main() {
    var sum = 0
    var i = 1
    while (i <= 100) {
        sum += i
        i++
        if (sum > 1000) {   //if sebagai tempat pengecekan
            break         //akan keluar 1035, karena sebelum keluar 1035, dibawah 1000
        }
        println(sum)
    }
    println(sum)

}
