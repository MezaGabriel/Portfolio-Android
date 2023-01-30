package com.gabrielmeza.portfolio

// Extension Functions
private fun String.noSpaces(): String {
    this.replace("", "")
}
private fun IntArray.show() {
    print("[")
    for(i in this) print("$i")
    println("]");
}

class Person { 
    var user = "    Its me   "
    println("${user} (${user.length}) - ${user.noSpaces()} (${user.noSpaces().length})") // Extension used

    var array1: Array<Int> = arrayOf(5,4,3,2,1) // This can not be extended

    var array2 = IntArray(3)
    array2[0] = 10
    array2[1] = 20
    array2[2] = 30
    println("array 2: "); array2.show() // Extension used

    var array3: IntArray = intArrayOf(1,2,3,4,5)
    println("array 3: "); array3.show() // Extension used
}