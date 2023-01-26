package com.gabrielmeza.portfolio

class Person (var name: String = "Anonimo", var passport: String? = null) { // <- Here are the parameters for the constructor
}

// Called Builder
var gabriel: Person = Person("Gabriel", "ASDGHJ12367") // <- Here we call the builder giving the values
println(gabriel.name)
println(gabriel.passport)

var anonimo: Person = Person()
println(anonimo.name)
println(anonimo.passport)