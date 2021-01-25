// variables declared outside the main() funtion are top-level variables

fun main(){
// VARIABLES
// There are are two ways you can declare variables in Kotlin
// using the "var" keyword creates a variable whose value can be changed at any point in time
    var name: String = "Mark"
// using the "val" keyword creates a constant
    val pi: Double = 3.14159265

// variables in kotlin are non-nullable by default
// to make a variable nullable
    var hobbies: String? = null
// Kotlin supports type inferences so type cam be omitted during declaration

// FORMATTED STRINGS
    println("The value of pi is $pi")
}
