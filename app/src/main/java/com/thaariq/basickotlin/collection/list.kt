package com.thaariq.basickotlin.collection

fun main() {
    val numberlist = listOf(1,2,3,4,5)
    val charlist = listOf('a','b','c')
    val anylist1 = listOf('a',"kotlin",3,true)

    println(anylist1)
    println(anylist1[3]) //angka di dalam [] mengambil index didalam listof



//mutabLeListOf berguna untuk mengubah isi dari list
    val anylist = mutableListOf('a',"String", 7,"haha", true, 69)
    anylist.add('d')                  //".add" tanpa penjelasan akan menambah item diakhir list
    println(anylist)
    anylist.add(2,"my") //akan menambah item di index yang ditentukan
    println(anylist)
    anylist[3] = false               //akan mengganti item di index yang ditentukan []
    println(anylist)
    anylist.removeAt(4)        //akan menghapus item di index yang ditentukan
    println(anylist)

}