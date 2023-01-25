package com.gabrielmeza.portfolio

class Variables {

    // Constant Variables
    companion object{
        const val currency = "EUR" // Can't be changed
    }

    // Local Variables

    val date = "05/09/1996" // Can't be changed
    var name: String = "Gabriel" // Could be changed
    var vipClient: Boolean = false
    var balance : Float = 300.54f
    var number : Int = 62
    var salary = 764.82 // Double

    // Rename Local Variable
    name = "Adrian" // This is applying changes
    // date = "03/10/1996" This is not applying changes

    var greetings = "Hello " + name

    // Print in console
    println(greetings)
}