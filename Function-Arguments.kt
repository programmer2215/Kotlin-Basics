// VARARGS

// the vararg keyword allows you to represent varying numbers of parameters in functions
// this is similar to *args in python
fun fav_subjects(vararg subjects : String) {
    subjects.forEach{subject -> println(subject)}
}
// DEFAULT ARGUMENTS
// some times we might not want to enter a required argument when a funtion is called
// but doing so will give us ann error message
// to solve this issue you can specify default values for the function's arguments
fun student_details(name:String = "Jane Doe", studentId:Int=0 ,cur_class:String="Nil", gender:String="Nil", subjects: Array<String> = arrayOf(), honours:Boolean = false){
    println("Student Name: $name")
    println("Student ID: $studentId")
    println("Student class: $cur_class")
    println("Gender: $gender")
    println("Subjects Chosen:")
    subjects.forEachIndexed { index, subject ->
        println("  ${index + 1}) $subject")
    }
    if(honours){
        println("* $name has Honours")
    }
}

fun main(){
    // number of arguments is variable
    fav_subjects("Computer Science")
    fav_subjects("Physics", "Math")
    fav_subjects()

    // passing arrays into vararg argument
    // in Kotlin an array variable cannot be used directly in vararg
    // instead an "*" is added before the variable
    // fav_subjects(*<array variable>)
    println("\nusing *<array variable>: ")
    val subjects = arrayOf("Chemistry", "Business Studies", "Economics")
    fav_subjects(*subjects)

    // NAMED ARGUMENTS
    // it is very easy to mess up the order of arguments for a function
    // to solve this issue, yu could specify the name of the argument when you pass it
    // e.g.:
    var subjects_ = arrayOf("CS", "Math", "Physics", "Chem")
    println()
    student_details(studentId = 1221, cur_class = "A Level", name="Mark Madhukar", gender="Male", honours = true, subjects = subjects)
    println()
    // now we call the function with default arguments
    student_details()

}