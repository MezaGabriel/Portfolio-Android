package com.gabrielmeza.portfolio

class Person(private var name: String = "Anonimo", private var passport: String? = null) { 

}

fun getName(): String{ return this.name } // Getter
fun getPassport(): String{ return this.name } // Getter

fun setName(n: String) { this.name = n } // Setter
fun setPassport(p: String) { this.passport = p } // Setter