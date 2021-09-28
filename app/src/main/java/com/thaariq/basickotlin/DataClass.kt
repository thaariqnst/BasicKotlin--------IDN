package com.thaariq.basickotlin

class Animal(val name : String, val age : Int)

data class DataAnimal(val name : String, val age : Int)
//DATA CLASS HARUS DILUAR FUNCTION

fun main() {
    val animal = Animal("Tiger", 4)
    val dataAnimal = DataAnimal("Elephant", 5)
    //equal()
    val dataAnimal2 = DataAnimal("Elephant", 5)
    val dataAnimal3 = DataAnimal("cow", 3)
    //.copy()
    val dataAnimal4 = dataAnimal3.copy()

    println(animal)
    println(dataAnimal)

    println(dataAnimal2.equals(dataAnimal3))  //".equals" untuk perbandingan
    println(dataAnimal4)  //".copy" untuk mengikuti variable yang disebut


    //component
    val name = dataAnimal.component1()  //pemanggilan component dimulai dari satu
    println("\"$name\" adalah component 1 dari variable dataAnimal")

}

