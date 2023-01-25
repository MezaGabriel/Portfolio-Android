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

}