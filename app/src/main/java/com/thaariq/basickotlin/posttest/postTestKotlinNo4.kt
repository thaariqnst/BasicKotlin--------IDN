package com.thaariq.basickotlin

fun main() {
    print("1 + 1 = ")
    calculator(1, '+', 1)
    print("1 - 1 = ")
    calculator(1, '-', 1)
    print("1 / 1 = ")
    calculator(1, '/', 1)
    print("1 * 1 = ")
    calculator(1, '*', 1)
    print("1 % 1 = ")
    calculator(1, '%', 1)
    calculator(1, 'a', 1)

}

// TODO 1 Lengkapi fungsi berikut dengan program yang dapat menghitung operator
// penjumlahan +
// pengurangan -
// pembagian /
// perkalian *
// modulus %

fun calculator(no:Int, prog:Char, no2:Int) {
    // TODO 2 Buat kondisi jika operator yang diinputkan salah
    // maka cetak text berikut sebagai output
    // "Operator tidak dikenali program"
    when (prog) {

        '+' -> println(no + no2)
        '-' -> println(no - no2)
        '/' -> println(no / no2)
        '*' -> println(no * no2)
        '%' -> println(no % no2)
        else -> println("operator tidak dikenali program")
    }
}

// ekspektasi output:
// 1 + 1 = 2
// Operator tidak dikenali program