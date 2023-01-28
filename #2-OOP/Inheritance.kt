package com.gabrielmeza.portfolio

open class Person(var name: String = "Anonimo", var passport: String? = null) { 

    // Attribute
    var alive: Boolean = true
    // Method
    fun Person(){
        name = "Jhon"
        passport = "98765MNBV"
    }
}

// EXAMPLE                                                          HERE WE EXTEND 
class Athlete (name: String, passport: String?, var sport: String): Person(name, passport)

var messi: Athlete = Athlete("Messi", "MESSID10S", "Futbol")
