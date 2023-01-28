package com.gabrielmeza.portfolio

open class Person(var name: String = "Anonimo", var passport: String? = null): die(), sayHi { // Inheritance + Interface

    // Attribute
    var alive: Boolean = true
    var greetings: String = "Hello"
    // Method
    fun Person(){
        name = "Jhon"
        passport = "98765MNBV"
    }
}

abstract class die(){
    var alive: Boolean = false
}

// With the interface we can add attributes to an already inherited class - Multi-Inheritance
interface sayHi(){
    fun println(greetings) // Interfaces do not have constructors
}