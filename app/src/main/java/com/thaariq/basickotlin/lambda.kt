package com.thaariq.basickotlin

//GUNA LAMBDA ADALAH UNTUK MENGATUR println dll DILUAR MAIN FUNCTION
fun main() {
    message()
    printMessage("Hello lambda with parameter")
    val length = messageLength("Hello from lambda")
    println("Message length = $length")
}

//bentuk function message
/*
fun message(){
    println("Hello from function")
}*/

//bentuk funtion diubah menjadi lambda
val message = { println("Hello from lambda")}
//lambda dengan parameter/ menjelaskan tipe data
val printMessage = {messuge : String -> println(messuge)}
//untuk mengukur length dari message
val messageLength = { message: String -> message.length}

