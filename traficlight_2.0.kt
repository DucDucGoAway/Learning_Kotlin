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

/*
fun main() {
    val lightwhen = "I'm colourblind"
    
    when(lightwhen) {
        "Red", "red"       						-> println("STOP!!!")
        "Green", "green", "I'm colourblind"     -> println("yeah mate go ahead.")
        "Yellow", "yellow", "amber", "Amber"    -> println("slow down")
        "I'm colorblind"						-> println("please write colour correctly")
        else        							-> println("what?")
    }
}
*/

/*
fun main() {
    val light = "Red"
    
    val message = if (light == "Red") "STOP!!!"
    else if (light == "Green") "yeah mate go ahead."
    else if (light == "Yellow") "slow down"
    else "what?"
    
    println(message)
}
*/



fun main() {
    val light = "blue"
    
    val message = when(light) {
    	"Red", "red"							-> "STOP!!"
    	"Green", "green", "I'm clourblind"		-> "yeah go ahead mate."
    	"Yellow", "yellow", "Amber", "amber"	-> "slown down"
    	else									-> "what?"
    }
    println(message)
}
