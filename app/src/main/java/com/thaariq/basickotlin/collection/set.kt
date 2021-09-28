package com.thaariq.basickotlin.collection

fun main() {
    val integerSet = setOf(1,2,4,2,1,5)
    println(integerSet)

    val setA = setOf(1,2,4,2,1,5)
    val setB = setOf(1,2,4,5)
    println(setA == setB)

    val setAA = setOf(1,2,4,2,1,5)
    val setCC = setOf(1,5,7)
    val union = setAA.union(setCC)          //".union" akan mengambil semua item di kedua variable
    val intersect = setAA.intersect(setCC)  //".intersect akan mengambil HANYA item yang sama di kedua variable

    println(union)
    println(intersect)


//mutableSetOf berguna untuk menambah/mengurangi isi set
//namun, dalam set kita tidak bisa me-replace isi

    val mutableSet = mutableSetOf(0,1,2,3,4,5,6,7)
    //mutableset[2]               //TIDAK BISA MENGUBAH
    mutableSet.add(8)             //menambah item di akhir set
    println(mutableSet)
    mutableSet.remove(9)  //mengurangi item di set
    println(mutableSet)


}