package com.thaariq.basickotlin

///Anda sedang membuat perangkat lunak parkir mobil yang perlu menghitung dan menampilkan jumlah yang harus dibayar berdasarkan jumlah jam mobil diparkir
//Biaya hitung berdasarkan struktur harg aberikut :
//1. 5 Jam pertama 1$ per jam
//2. setelah itu, 0.5$ jam
//3. untuk setiap 24 jam, ada biaya tetap sebesar 15$
//
//Artinya, misalnya, jika mobil diparkir selama 26 jam, tagihannya harus 15+(2*0,5) = 16,0,
//karena diparkir selama 24 jam ditambah 2 jam tambahan


/*fun main() {
    var jam = 8.0
    var hasil : Double = 0.0
    var satuHari = 1.0

    if(jam <=5.0){
        hasil = 1.0*jam
    }else if (jam >=5.0){
        hasil = 5.0+((jam-5.0)*0.5)
    }else {
        (jam >= 24.0)
        hasil = satuHari * 1.0



        println(hasil)
    }
}*/

fun main() {
    var jam =  31
    when(jam) {
        in 1..5 -> println("bayar parkir sebanyak \$${jam * 1.0}")
        in 6..23 -> println("bayar parkir sebanyak \$${((jam - 5 ) * 0.5) + 5}")
        else -> println("bayar parkir sebanyak \$${(jam % 24) * 0.5 + (jam/24 * 15)}")
    }
}
