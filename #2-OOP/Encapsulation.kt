package com.gabrielmeza.portfolio

// PUBLIC-PRIVATE
class Person(private var name: String = "Anonimo", private var passport: String? = null) { // With PRIVATE we are able to close the scope

    // Attribute
    var alive: Boolean = true
    // Method
    fun die(){
        alive = false
    }

}

//PROTECTED-INTERNAL
class Person(protected var name: String = "Anonimo", protected var passport: String? = null) { // With PROTECTED we are able to close the scope

    // Attribute
    var alive: Boolean = true
    // Method
    internal fun die(){ // With INTERNAL we encapsulate the function
        alive = false
    }

}