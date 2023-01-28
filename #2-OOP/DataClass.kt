package com.gabrielmeza.portfolio

data class Star(var name: String = "", var radius: Float = 0f, var galaxy: String = "") { 
    // Attribute
    var alive: Boolean = true
}

var sun: Star = Star("Sun", 917240f, "milky-way")
println(sun)
var betelguese: Star = Star("Betelguese", 917240f, "Orion")
betelguese.alive = false
println(betelguese.alive)