package com.gabrielmeza.portfolio

class Loops {

    // Variables
    var pin: Int = 1234
    var attempts: Int = 0
    var enteredKey: Int = 1232

    // DoWhile
    do{
        println("Enter your PIN:  ")
        println("Entered Key:  ${++enteredKey}")
        if(enteredKey == pin) break
        attempts ++
    }while(attempts < 3 && enteredKey != ping)
    if (attempts == 3) println("Card Blocked")

    // For
    fun travelArray(array: Array<String>){

        // 1° type
        for(i in array)
            println(i)

        // 2° type
        for(i in array.index)
            println(array.get(i))

        // 3° type
        for(i in 0 .. array.size -1)
            println("${i+1}: ${array.get(i)}")
    }

    // Nested for
    for(i in (0 until matrix.size)){
        println()
        for(j in (0 until matrix[i].size))
            println("Position[$i][$j] : ${matrix[i][j]}") 
    }

    // While
    var investAmount = 90f
    var index = 0
    while(balance >= investAmount){
        company = bolsa.elementAtOrNul(index)!! // This is a Null-Safety check "!!"
        if(company != null){
            balance -= investAmount
            println("Has been invested $investAmount $currency en $company")
            invest.put(company, investAmount)
        }
        else break
        index++
    }

}