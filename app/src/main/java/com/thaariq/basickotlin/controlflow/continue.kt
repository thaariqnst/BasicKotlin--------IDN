package com.thaariq.basickotlin.controlflow

fun main() {
    var sum = 0
    var i = 1
    while (i <= 100) {
        i++
        if (i%2 != 0){   //"!=" berarti "TIDAK SAMA DENGAN"
            continue
        }
        sum += i
        println(sum)
    }
}
