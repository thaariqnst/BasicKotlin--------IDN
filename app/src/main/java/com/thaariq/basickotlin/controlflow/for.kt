package com.thaariq.basickotlin.controlflow

fun main() {
    for (angka in 100 downTo 0 step 5)
        println(angka)
    for (huruf in 'Z' downTo 'A' step 5)
        println(huruf)

    val name = "Yusril"

    for (namee in name){
        println(name)
    }
    for (number in 1..5){
        println("Nomor $number")
    }//".." titik dua adalah sama dengan "rangeTo"
    for (i in 1.rangeTo(5)){
        println(i)
    }
    for (index in (19.downTo(9)step 3)){
        println(index)
    }
    val range : String = "Halo"         //UNTUK STRING
    range.forEachIndexed{index, value ->
        println("index $index = $value")
    }
    println("")
    val satuSampeSembilan = 1..9       // UNTUK INT
    satuSampeSembilan.forEachIndexed{index, value ->
        println("index $index = $value")
    }

}