package com.gabrielmeza.portfolio

class Collections {

    // Variables

    // Arrays
    var receipts: Array<String> = arrayOf("light", "wather", "gas")

    // Matrix
    var matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Set 
    // Non-Mutable
    var vipClients: Set<Int> = setOf(1234, 5678, 4040) // vipClients can't be modifyed.
    var mixedSet = setOf(2, 4.454, "home", 'c')  // mixedSet can't be modifyed.
    // Mutable
    var clients: MutableSet<Int> = setOf(1234, 5678, 9090, 8080) // Clients can be modifyed. Ex: clients.add()

    // List 
    // Non-Mutable
    var currencies: List<Int> = listOf("USD", "EUR", "YEN") // currencies can't be modifyed.
    var mixedList = listOf(4, 5.846, "car", 'a')  // mixedSet can't be modifyed.
    // Mutable
    var badge: MutableList<Int> = mutableListOf("Coke", "Adidas", "Amazon", "Pfizer") // badge can be modifyed. Ex: badge.add()

    // Map
    // Non-Mutable
    var map: Map<Int, String> = mapOf(
        1 to "Spain",
        2 to "Mexico",
        3 to "Colombia"
    )
    // Mutable
    var invest = mutableMapOf<String, Float>()
    

}