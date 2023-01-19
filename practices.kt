//notification Summary
/*
fun main() {
   	val morningNotification = 51
   	val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages <= 99) {
    	println("You have $numberOfMessages notifications")
    }
    else {
        println("You have 99+ notifications")
    }
}
*/

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

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age) {
        in 0..12			-> 15
        in 13..60			-> if(isMonday == true) {25} else {30}
        in 61..100			-> 20
        else				-> -1
    }
}
*/

// Temperature Converter

fun main() {
    
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}











