package com.thaariq.basickotlin.collection

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    //untuk print semua isi dari key atau value
    val mapkeys = capital.keys
    val mapvalues = capital.values

    println(mapkeys)
    println(mapvalues)

    //untuk menambah key-value
    val mutablecapital = capital.toMutableMap()
    mutablecapital.put("Amsterdam","Netherlands")
    mutablecapital.put("Berlin","Germany")

    println(mutablecapital)

    val mutablecapitalkeys = mutablecapital.keys
    val mutablecapitalvalues = mutablecapital.values
    println(mutablecapitalkeys)
    println(mutablecapitalvalues)
}