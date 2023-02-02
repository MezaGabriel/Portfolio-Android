package com.gabrielmeza.portfolio

// Variable that promises a value for Attribute 
private lateinit var alive: Boolean

open class Person(var name: String = "Anonimo", var passport: String? = null) { // Class
    // Here we give the value we promised
    fun die(){
        alive = false
    }
}

// This creates the variable and does not assign a 
// value to it, until it is started for the first time.
val name: String by lazy { "New" }