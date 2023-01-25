package com.gabrielmeza.portfolio

class Functions {

    // Variables
    companion object{
        const val currency = "EUR" // Can't be changed
    }
    var balance : Float = 300.54f
    var salary : Float = 764.82f



    //Functions
    fun showBalance() {
        print("You have $salary $currency")
    }

    fun enterSalary() {
        balance += salary
        println("Your salary has been deposited of $salary $currency")
    }

    // Parameterized Function
    fun enterMoney(quantity : Float) {
        salary += quantity
        println("Has been entered $salary $currency")
    }

    // Parameterized Function with Conditions
    fun withdrawMoney(quantity : Float) {
        if(checkQuantity(quantity)) {
            salary -= quantity
            println("Has withdrawn $salary $currency")
        } else println("Amount in excess of the balance. Impossible to perform the operation")
    }

    // Functions With Returns
    fun checkQuantity(quantity : Float) : Boolean{
        if(quantity > salary) return false
        else return true
    }

    // Called
    fun functionsCalled() {
        showBalance() // whitout parameters
        enterMoney(50.5f) // with paramaters
        withdrawMoney(40f) // with paramaters
    }

}