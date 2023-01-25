package com.gabrielmeza.portfolio

class Operators {

    // CALCULATION
    val a:Int = 5 + 5 // 10
    val b:Int = 10 - 2 // 8
    val c:Int = 3 * 4 // 12
    val d:Int = 10 / 5 // 2
    val e:Int = 10 % 3 // 1, cannot be divided, the remainder is retained
    val f:Int = 10 / 6 // 1, infinite division, only the int part is kept

    var aPreIncrement: Int = 5
    var bPreDecessor: Int = 5
    var cPostIncrement: Int = 5
    var dPostDecessor: Int = 5

    println(aPreIncrement)
    println(++aPreIncrement) // Increment first, then return. Exit: 6
    println(aPreIncrement)

    println(bPreDecessor)
    println(--bPreDecessor) // Decrease first, then return. Exit: 4
    println(bPreDecessor)

    println(cPostIncrement)
    println(cPostIncrement++) // Return first, then increase. Exit: 5
    println(cPostIncrement)

    println(dPostDecessor)
    println(dPostDecessor--) // Return first, then decrease. Exit: 5
    println(dPostDecessor)

    // Example +=
    saldo = saldo + sueldo
    saldo += sueldo


    // COMPARISON
    a == b
    a != b
    a > b
    a < b
    a >= b
    a <= b
}