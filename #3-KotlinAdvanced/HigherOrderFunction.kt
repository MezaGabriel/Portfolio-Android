package com.gabrielmeza.portfolio
// They receive a function as a parameter


// Higher Order Function - Calculator
private fun calculator(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int { // Higher Order Function created
    return fn(n1, n2)

}
private fun addition(x: Int, y: Int): Int { return x+y }
private fun subtraction(x: Int, y: Int): Int { return x-y }
private fun multiplication(x: Int, y: Int) = x*y 
private fun divide(x: Int, y: Int) = x/y 

class Prints { 
    println("The addition of 80 and 20 is ${calculator(80, 20, ::addition)}") // Higher Order Function used
    println("The subtraction of 80 and 20 is ${calculator(50, 10, ::subtraction)}") // Higher Order Function used
    println("The multiplication of 80 and 20 is ${calculator(7, 7, ::multiplication)}") // Higher Order Function used
    println("The divide of 80 and 20 is ${calculator(12, 3, ::divide)}") // Higher Order Function used
}

// High Order Functions in Objects
private fun inArgentina(h: Float): Boolean{
    return h >= 1.60f
}
private fun inBrazil(h: Float): Boolean{
    return h >= 1.65f
}

open class Person(var name: String = "Anonimo", var passport: String? = null, var height: Float = 1.60f) { 

    // Attribute
    var alive: Boolean = true
    // Method
    fun Person(){
        name = "Jhon"
        passport = "98765MNBV"
    }
    fun checkPolice(fn(Float)->Boolean): Boolean{ // Higher Order Function created
        return fn(height)
    }
}

var gabriel: Person = Person("Gabriel", "1234ASDG")
if(gabriel.checkPolice(::inArgentina)) println("${gabriel.name} can be COP in Arg") // Higher Order Function used
if(gabriel.checkPolice(::inBrazil)) println("${gabriel.name} can be COP in Bra") // Higher Order Function used