package com.thaariq.basickotlin.operator

fun main() {

    //operator penugasan
    var a = 10
    a = a + 10 //bisa disingkat menjadi a += 10


    var b = 10
    b += 10 //versi disingkat

    println(a)
    println(b)

//=================================================//

    //operator perbandingan
    val x = 200
    val y = 200
     val hasil = x>y
    println(hasil)

    val z = 9
    val zz = 10
     val hasilz = z>=zz
    println(hasilz)

///operator perbandingan
//> : Lebih Dari
//< : Kurang dari
//>= :Lebih dari sama dengan
//<= : kurang dari sama dengan
//== : sama dengan
//!= : tidak sama dengan

//================================================//

    //operator && (Dan)
//jika salah satu false, hasilnya pasti false

    //operator || (Atau)
//jika salah satu true, hasilnya pasti true

    //operator ! (Negasi)
//hasilnya akan menjadi kebalikan

//===================================================//

   //operator Increment(++) dan Decrement (--)

   var nice = 69
   nice ++  //++ menambah 1 (hanya bisa +1)
    println(nice)
   nice -- //-- mengurangi 1 (hanya bisa -1)
   println(nice)


    
}