Solutions
Docs
Community
Teach
Play

1.8.0
JVM

Copy link
Share code
Run

fun main() {
    val coins: (Int) -> String = {
        "$it quarters"
    }
    
    
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}
​
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick == true) {
        return trick
    } else {
        if (extraTreat != null) {
        println(extraTreat(5))
        }
        return treat
    }
}
​
val trick = {
    println("No treats!")
}
​
val treat: () -> Unit = {
    println("Have a treat!")
}
