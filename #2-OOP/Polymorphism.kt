package com.gabrielmeza.portfolio

class Person { // This is the name of the Object

    // Attribute
    var alive: Boolean = true
    // Method
    fun die(){
        alive = false
    }
}
// With OVERRIDE we can Replace or Add functions that have already been defined 
override fun die(){ 
    alive = true // Here we make an absolute change in the function 
    super.die() // With SUPER we call the original function
    } 
