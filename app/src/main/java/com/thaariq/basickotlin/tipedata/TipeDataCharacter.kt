package com.thaariq.basickotlin.HelloWorld

fun main() {
    var char1 : Char = 'E'
    var char2 : Char = '1'
    //Tipe Data Character hanya bisa diisi 1 karakter huruf/angka

    //special characters//

    // \t, \b, \n, \r, \', \", \\, \$
    println("Hello World")
    println("\tHello World") //"\t" memberikan indentasi (semacam tab/spasi)
    println("\bHello World") //"\b"
    println("\nHello World") //"\n" memberikan space/paragraf/baris
    println("\rHello World") //"\r"
    println("\'Hello World") //"\'" memberikan tanda '
    println("\"Hello World") //"\"" memberikan tanda "
    println("\\Hello World") //"\\" memberikan tanda \
    println("\$Hello World") //"\$" memberikan tanda $
    println("\uFF00")        //unicode custom memberikan emoji (masing2 emoji memiliki unicode)
}