package com.gabrielmeza.portfolio

// OBJECT
object gabriel{
    var name = "Gabriel"
    fun greetings(){println("Hello, my name is $name")}
}

class Person { 
    // Attribute
    var alive: Boolean = true
    // Method
    fun die(){
        alive = false // We cannot insert the object inside a function
    }
}

println(gabriel.greetings())
gabriel.name = "Super Gabriel"
println(gabriel.greetings())