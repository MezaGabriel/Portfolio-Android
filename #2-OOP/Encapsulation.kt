package com.gabrielmeza.portfolio

class Person(private var name: String = "Anonimo", private var passport: String? = null) { // With PRIVATE we are able to close the scope

    // Attribute
    var alive: Boolean = true
    // Method
    fun die(){
        alive = false
    }

}