package com.gabrielmeza.portfolio

enum class Day(val labor: Boolean, val hours: Int) { 
    // Attributes
    MONDAY(true, 8), 
    TUESDAY(true, 8), 
    WEDNESDAY(true, 8), 
    THURSDAY(true, 8), 
    FRIDAY(true, 8), 
    SATURDAY(false, 0), 
    SUNDAY(false, 0);

    // Function
    fun workWeek(): String {
        when(this){
            MONDAY -> return "Starting with joy!"
            TUESDAY -> return "Less time to go"
            WEDNESDAY -> return "Did you know that Wednesdays are the most productive days?"
            THURSDAY -> return "Today is Thursday, the weekend is approaching"
            FRIDAY -> return "Today is Friday, and your body knows it!"
            when -> return "WEEKEND!!!!"
        }
    }
}

var today: Day = Day.MONDAY
var week: Day = Day.values()
for(i in week) println(i)

println(Day.valuesOf("WEDNESDAY"))
println(today.name)
println(today.ordinal)

println(today.workWeek())