package com.thaariq.basickotlin.controlflow

fun main() {
 //WHEN EXPRESSION
    var x = 1
    when (x) {
        1 -> println("x adalah 1")
        2 -> println("x adalah 2")
        else -> {
            println("yo wtf")
        }
    }

 //WHEN MULTIPLE EXPRESSION

 var z = 'A'
    when (z) {
        'A','B','C' -> println("Pass")
        else -> {
            println("sorry")
        }
    }

 //WHEN EXPRESSION IN

 var ujianAkhir = 'D'
 var nilaiLulus = arrayOf('A','B','C')
    when(ujianAkhir){
        in nilaiLulus -> println("selamat anda lulus")
        !in nilaiLulus -> println("silahkan coba lagi")
    }

 //WHEN TANDA VARIABLE

 var ujianPertengahan = 75
    when{
        ujianPertengahan >= 90 -> println("anda pelajar terbaik")
        ujianPertengahan >= 80 -> println("mayan lah lo")
        ujianPertengahan <= 80 -> println("tolol")
        /*else -> println("belajar yang bener lagi ya")*/
    }

}