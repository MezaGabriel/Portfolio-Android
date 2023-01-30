package com.gabrielmeza.portfolio
//Attributes of a class can be unstructured to isolate data

data class Star(var name: String = "", var radius: Float = 0f, var galaxy: String = "") { 
    // Attribute
    var alive: Boolean = true
}

var sun: Star = Star("Sun", 917240f, "milky-way")
println(sun)

var (nameStar2, radiusStar2, galaxy2): Star = Star("Sun2", 917241f, "milky-way2")
println("nameStar2 data unstructured: $sun2, $radiusStar2, $galaxy2")

var (nameStar3, radiusStar3): Star = Star("Sun3", 917242f, "milky-way3")
println("nameStar3 data unstructured: $sun3, $radiusStar3")

var (nameStar4, _, galaxy4): Star = Star("Sun4", 917243f, "milky-way4")
println("nameStar4 data unstructured: $sun4, $galaxy4")
