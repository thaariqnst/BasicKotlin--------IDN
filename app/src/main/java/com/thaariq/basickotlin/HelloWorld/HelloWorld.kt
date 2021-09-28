package com.thaariq.basickotlin.HelloWorld

//Android_lesson_25_August_2021
//Variables

fun main(){

println(immutable())
println("\n")
println(tipedatanumber())
println(kodenullabel())


}

//======immutable=====
fun immutable() : String{

    val vSatu: Int = 6969
    println("Hello $vSatu")
    var vDua: String = "Adi"

    vDua = "Budi"
    println(vDua)
    println(vSatu)

    return vDua
}

//======kode nullable======
fun kodenullabel(){

    var vTiga: String?      //nullable = menggunakan_tanda_tanya_(?)_diakhir_tipe_data
    var vEmpat: String      //non-nullable = tidak_menggunakan_tanda_tanya

    vTiga = "Anjay"
    //vTiga_bisa_dijadikan_null
    vTiga = null
    vEmpat = "Anjai"
    //vEmpat_tidak_bisa_dijadikan_null

    println(vTiga)
    println(vEmpat)
    println(CAR)
}

//======Tipe_Data_Number=====
fun tipedatanumber(){

    val bait: Byte = 120
    //tipe_data_number_mempengaruhi_memory/ram_usage

//mancari_value_max_dan_min_sebuah_data_number

    var byte : Byte = Byte.MAX_VALUE
    println(byte)
    byte = Byte.MIN_VALUE
    println(byte)

    var int : Int = Int.MAX_VALUE
    println(int)
    int = Int.SIZE_BYTES
    println(int)
}

//======const_val======
const val CAR = "Ferrari"

//======NOTEEEEEEEEEEEEEEE======
//Int = Angka
//Float = Desimal
//Char = Huruf
//String = Kata
