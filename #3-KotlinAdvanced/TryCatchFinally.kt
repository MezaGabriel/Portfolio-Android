package com.gabrielmeza.portfolio
/* Common types of runtime errors

NullPointerException
ArithmeticException
SecurityException
ArrayIndexOutOfBoundException

*/

println("Division 5/0 = ${5/0}") // this return an ArithmeticException

// Solution
try { // This attempts to execute the code
    println("Division 5/0 = ${5/0}")
}
catch(Exception e) { // This runs if there is an exception
    println("Let's handle this error")
}
finally{ // This is executed without regard to any of the above.
    println("Whatever happens, we will do things")
}

private fun valueTry(a: Int, b: Int){ // We can store the try catch in a Variable
    var res =
        try {
            println("Division = ${a/b}")
            a/b // Value stored in the Try
        }
        catch(Exception e) {d
            println("Let's handle this error")
            "Divide not allowed" // Value stored in the Try
        }
    return res
}

var res1 = valueTry(10, 2) // Execute try block
println(res1)
var res2 = valueTry(10, 0) // Execute catch block
println(res2)

// Throw Exceptions
var password: String = "1234"
if(password.length < 6) {
    throw Exception("Password to short")
}
else println("Safe password")