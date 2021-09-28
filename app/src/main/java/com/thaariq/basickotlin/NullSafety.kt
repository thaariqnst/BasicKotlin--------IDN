package com.thaariq.basickotlin

fun main() {

    //membuat null dan melakukan pengecekan dengan if-else


    //if-else versi panjang
    val a = 69
    if (a != null){

        println(a) //jika a bukan null, yang di print akan isi dari null
    }
    else {    //jika a adalah null yang di print akan "a = null/ kosong"
        println("a adalah null")
    }





    val b : String? = null
    println(b?.length) //ketika print variable null, nama var harus diberi "?"

    //if-else versi pendek
    val c : Int = if (b != null)b.length else -1
    println(c)

    //elvis operator
    val d = b?.length ?: -1
    println(d)

    //!!operator
    val e : String? = null
    println(e!!) //error karena isi val e adalah null, namun operator !! memaksa
                 //operator !! istilahnya "agar bisa dirunning aja"







}