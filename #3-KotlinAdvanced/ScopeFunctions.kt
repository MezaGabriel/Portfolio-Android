package com.gabrielmeza.portfolio

open class Person(var name: String = "Anonimo", var passport: String? = null) { // Class
    // Attribute
    var alive: Boolean = true
    // Method
    fun Person(){
        name = "Jhon"
        passport = "98765MNBV"
    }
    fun die(){
        alive = false
    }
}

// Scope Functions
var gabriel: Person = Person()
gabriel.let{ // Let Function
    it.die()
    it.name = "Gabriel"
    it.passport = "1234ASDG"
}
gabriel.apply{ // Apply Function - Example 1
    this.die()
    name = "Gabriel"
    passport = "1234ASDG"
}
var gabriel = Person("Gabriel", "1234ASDG").apply{ // Apply Function - Example 2
    this.die()
    this.name = "Gabriel"
    this.passport = "1234ASDG"
} also {
    it.alive = true
}
var maria = Person("Maria", "09876KJH").run{ // Run Function - Example 1
    this.name = "Maria"
    this.passport = "09876KJH"

    "Maria is an adult!"
}
var maria = with(Person("Marta", "09876ASD")){ // With Function - Example 1
    this.name = "Maria"
    this.passport = "09876ASD"

    "Maria is a child!"
}
