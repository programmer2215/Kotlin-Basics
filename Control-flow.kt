
fun main(){
    var interests: String? = null

    // CONTROL FLOW
    // IF & ELSE statements
    if (interests != null){
        println(interests)
    } else {
        println("No interests found :(")
    }
    // WHEN statements (Switch case)
    interests = "coding"
    when (interests){
        null -> println("No interests found :(")

        "coding" -> println("nice, you like coding!!")

        // Default code
        else -> println("you like something that is not coding...")
    }

    // IF & WHEN statements can also be used to assign values to variables

    var temp: String = if(interests != null) interests else "coding"

    var category: String? = when(interests){
        "coding" -> "computer Science"
        "space" -> "Physics"
        "fractals" -> "Math"
        else -> "unknown"
    }

}