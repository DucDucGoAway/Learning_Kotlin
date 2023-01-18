/*
fun main() {
    var favoriteActor: String? = "The Monster"
    
    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    }
	else {
        0
    }
    println("The number of characters in $favoriteActor is $lengthOfName")
}
*/

fun main() {
    val favoriteActor: String? = null
    
    val lengthOfName = favoriteActor?.length ?: 0
    
    println("The number of characters in your favorite actors name is $lengthOfName")
}
