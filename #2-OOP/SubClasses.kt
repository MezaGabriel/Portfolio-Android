package com.gabrielmeza.portfolio

class Person { // This is a class within a class
    
    private var name = "Mother"
    fun present(): String { return name }

    // Nested Class
    class Nested{ 
        private val nestedName =  "Nested"
        fun present(): String { return nestedName }
    } 

    // Internal Class
    inner class Internal{
        private val nameInternal = "Internal"
        fun present(): String { return "Hello, I'm ${this.nameInternal}, son of ${name}" }
    }
}

// Called Builder
var sc = SubClasses()
println(sc.present)

var ani = SubClasses.Nested()
println(ani.present)

var inn = SubClasses.Internal()
println(inn.present)