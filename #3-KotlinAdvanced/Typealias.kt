package com.gabrielmeza.portfolio
// Renaming an Object, Function or Variables

typealias aliasObject = Person.die // Here we rename
typealias aliasVariable = Person.alive // Here we rename
typealias aliasData = MutableMap<Int, ArrayList<String>> // Here we rename

class Person { // This is the name of the Object

    // Attribute
    var alive: Boolean = true
    var isAlive = aliasVariable()
    println(isAlive.alive)

    // Method
    fun die(){ alive = false }
    var dying = aliasObject()
    println(dying.alive)

    var greetings: aliasData = mutableMapOf()
    greetings[0] = arraListOf("Hello", "Bye")
    greetings[1] = arraListOf("Hola", "Chau")

}