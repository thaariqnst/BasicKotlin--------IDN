package com.thaariq.basickotlin.tipedata

fun main() {
    var benar : Boolean = true
    var salah : Boolean = false


    val fName = "Torik"
    val lName = "Nasution"
    val alamat = """
        Pearl Garden Sawangan
        blok B2
        Sawangan, Mars
    """.trimIndent()
    val fullName = fName + " " + lName

//contoh contoh
    val fName2 = "torik"
    val lName2 = "Nasution"
    val alamat2 = """
        |Pearl Garden Sawangan
        |blok B2
        Sawangan, Mars
    """.trimMargin()    //gunakan "|" diawal baris untuk disable margin

    val fName3 = "torik"
    val lName3 = "Nasution"
    val alamat3 = """
        #Pearl Garden Sawangan
        #blok B2
        Sawangan, Mars
    """.trimMargin(marginPrefix = "#") //gunakan marginPrefix untuk merubah prefix margin


    val nama = "Torik"
    val nama2 = "Nasution"
    val namafull = "$nama ${nama2.length}"



   /* println(fName)
    println(lName)
    println(alamat)
    println(fullName)*/

    println(namafull)

}