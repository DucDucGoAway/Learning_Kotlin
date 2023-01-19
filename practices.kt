//notification Summary
/*
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
​
fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages <= 99) {
        println("You have $numberOfMessages notifications")
    }
    else {
        println("You have 99+ notifications")
    }
}
*/
​
//movie Ticket Price
/*
fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is ${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is ${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is ${ticketPrice(senior, isMonday)}.")
}
​
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age) {
        in 0..12            -> 15
        in 13..60           -> if(isMonday == true) {25} else {30}
        in 61..100          -> 20
        else                -> -1
    }
}
*/
​
// Temperature Converter
// the tutorials made by Google straight up gave me the wrong formulas
// also their code was kinda weird to understand so I made my own
​
fun main() {
    val initialUnit: String = "Celcius"
    val finalUnit: String = "Fahrenheit"
    val initialMeasurement: Double = 30.0
    
    println("$initialMeasurement degrees $initialUnit are ${finalMeasurement(initialUnit, finalUnit, initialMeasurement)} degrees $finalUnit")
}
​
fun finalMeasurement(initialUnit: String, finalUnit: String, initialMeasurement: Double): Double {
    return when(initialUnit) {
        "Celcius"       -> when(finalUnit) {
            "Celcius"       -> initialMeasurement
            "Fahrenheit"    -> 1.8 * initialMeasurement + 32
            "Kelvin"        -> initialMeasurement + 273.15
            else            -> 0.0
        }
        "Fahrenheit"    -> when(finalUnit) {
            "Celcius"       -> 1.8 * (initialMeasurement - 32)
            "Fahrenheit"    -> initialMeasurement
            "Kelvin"        -> 1.8 * (initialMeasurement - 32) + 273.15
            else            -> 0.0
        }
        "Kelvin"        -> when(finalUnit) {
            "Celcius"       -> initialMeasurement - 273.15
            "Fahrenheit"    -> 1.8 * (initialMeasurement - 273.15) + 32
            "Kelvin"        -> initialMeasurement
            else            -> 0.0
        }
        else                -> 0.0
    }
}
​
​
​
​
​
​
​
​
​
