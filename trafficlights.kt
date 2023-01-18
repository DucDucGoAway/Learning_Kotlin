/*
fun main() {
    val lightif = "Blue"
    
    if(lightif == "Red") {
    println("STOP!!!")
    }
    
    else if (lightif == "Green") {
        println("yeah mate go ahead")
    }
    else if (lightif == "Yellow") { 
        println("slow down")
    }
    else {
        println("what?")
    }
}
*/

fun main() {
    val lightwhen = "Blue"
    
    when(lightwhen) {
        "Red"       -> println("STOP!!!")
        "Green"     -> println("yeah mate go ahead.")
        "Yellow"    -> println("slow down")
        else        -> println("what?")
    }
}
