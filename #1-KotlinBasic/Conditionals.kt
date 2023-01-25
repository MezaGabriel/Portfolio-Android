package com.gabrielmeza.portfolio

class Conditionals {

    // If and Else
    var vipClient: Boolean = false

    if (vip ==  true) greetings += ", we love you"
    else greetings += ", want to be VIP? Pay the fee" // is not mandatory

    // When     0123456789 -> position
    val date = "05/09/1996"
    var month = date.subSequence(3,  5).toString().toInt()

    when(month){
        1, 2, 3 -> print("\n In winter there are no investment offers")
        4, 5, 6 -> print("\n In spring there are investment offers with a 1% interest rate")
        7, 8, 9 -> print("\n In the summer there are investment offers with 2.5% interest rate")
        10, 11, 12 -> print("\n In autumn there are investment offers with 3.5% interest rate")
        else -> print("\n Incorrect date")
    }

    // Logic Operators
    var a: Boolean = true
    var b: Boolean = true
    var c: Boolean = false
    var d: Boolean = false

    a && b // AND
    a || b // OR
    !d //  Denail

}