package com.thaariq.basickotlin.posttest

fun main() {
    val nilaiMatematika = 88
    val nilaiInggris = 93
    val nilaiSejarah = 75
    var predikatC = arrayOf(55,60,65,70,75)
    var predikatB = arrayOf(76,80,85,88,90)
    var predikatA = arrayOf(91,92,93,94,95)

    when (nilaiMatematika){
        in predikatC -> println("Matematika Predikat C dengan nilai = $nilaiMatematika")
        in predikatB -> println("Matematika Predikat B dengan nilai = $nilaiMatematika")
        in predikatA -> println("Matematika Predikat A dengan nilai = $nilaiMatematika")
    }
    when (nilaiInggris){
        in predikatC -> println("Inggris Predikat C dengan nilai = $nilaiInggris")
        in predikatB -> println("Inggris Predikat B dengan nilai = $nilaiInggris")
        in predikatA -> println("Inggris Predikat A dengan nilai = $nilaiInggris")
    }
    when (nilaiSejarah){
        in predikatC -> println("Sejarah Predikat C dengan nilai = $nilaiSejarah")
        in predikatB -> println("Sejarah Predikat B dengan nilai = $nilaiSejarah")
        in predikatA -> println("Sejarah Predikat A dengan nilai = $nilaiSejarah")
    }

}