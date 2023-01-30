package com.gabrielmeza.portfolio
// It is a function inside a variable

// Higher Order Function - Calculator
private fun calculator(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int { 
    return fn(n1, n2)

}
private fun addition(x: Int, y: Int): Int { return x+y }
private fun subtraction(x: Int, y: Int): Int { return x-y }
private fun multiplication(x: Int, y: Int) = x*y 
private fun divide(x: Int, y: Int) = x/y 

// Lambda allows to manipulate code blocks under the same name

var function = {x: Int, y: Int -> x+y} // Lambda created
println("The addition of 80 and 20 is ${calculator(80, 20, function)}") // Lambda used

function = {x: Int, y: Int -> x-y} // Lambda recreated
println("The subtraction of 80 and 20 is ${calculator(50, 10, function)}") // Lambda used

println("The multiplication of 80 and 20 is ${calculator(7, 7, {x: Int, y: Int -> x*y})}") // Lambda created and used
println("The divide of 80 and 20 is ${calculator(12, 3, {x: Int, y: Int -> x/y})}") // Lambda created and used

println("the power of 2 raised to 5 is ${calculator(12, 3,) // Lambda created and used with an Extension
{
    x, y ->
        var value = 1
        for(i in 1..y) value *= x

        value // The last line always has to return a value
}
}") 

var array1 = IntArray(10) {5} // With this lambda we give the value for each iteration
var array2 = IntArray(10) {it}// With this we give the value of the index of each iteration
var array3 = IntArray(5) {it*2}// Here we store even numbers
var array4 = IntArray(5) {i -> i*3} // Rename the input parameter that holds the lambda


var sum = 0
private fun traverseArray(array: IntArray, fn: (Int) -> Unit){
    for (i in array)
        fn(i)
}
traverseArray(array4){
    sum += it // A lambda can access external variables in the code.
}
