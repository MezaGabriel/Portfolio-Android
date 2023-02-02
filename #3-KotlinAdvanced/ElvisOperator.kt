package com.gabrielmeza.portfolio

open class Person(var name: String = "Anonimo", var passport: String? = null) { // Class
    // Attribute
    var alive: Boolean = true
    // Method
    fun Person(){
        name = "Gabriel"
        passport = "98765MNBV"
    }
    fun die(){
        alive = false
    }
}

var lastName : String? = "Meza"
lastName = lastName?.uppercase() ?: "UNKNOWN"
println(lastName) //              ^ With this operator we handle the conditions

var age : String? = null
lastName = lastName?.uppercase() ?: "UNKNOWN"
println(lastName)  //             ^ With this operator we handle the conditions