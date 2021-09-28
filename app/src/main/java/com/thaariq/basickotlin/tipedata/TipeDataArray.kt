package com.thaariq.basickotlin.tipedata

fun main() {

    //Array<String> untuk mengisi array dengan string
    val babu: Array<String> = arrayOf("Sopo", "yang sabar", "ya boss")
    //Array<Any> untuk mengisi array bebas
    val random: Array<Any> = arrayOf(1, true, "dennis beban")


    //cara lama untuk mengubah isi array
    babu.set(0, "qoola sopo :")
    //cukup gunakan array[] = "..." untuk mengubah isi array
    babu[2] = "ya bossss"

    //cara lama memanggil array
    println(babu.get(0))
    //cukup gunakan array[] untuk memanggil array
    println(babu[1])
    println(babu[2])


    //array of null, mengisi array dengan null
    val nulle: Array<Any?> = arrayOfNulls(size = 2)
    nulle.set(0, null)
    nulle.set(1, "sopo ganteng")

    for (i in nulle) {
        println(i)
}
}
