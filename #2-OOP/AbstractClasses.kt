package com.gabrielmeza.portfolio

open class Person(var name: String = "Anonimo", var passport: String? = null): die() { // Here you inherit the properties of the class

    // Attribute
    var alive: Boolean = true
    // Method
    fun Person(){
        name = "Jhon"
        passport = "98765MNBV"
    }
}

abstract class die(){ // Here we make the abstract class
   // Attribute
    var alive: Boolean = false
}