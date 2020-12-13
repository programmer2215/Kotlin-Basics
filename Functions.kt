
// basic functions...
fun greet(){
    println("Hello 👋")
}

fun greeting(): String{
    return "Hello Kotlin!!!"
}

fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

// Single expression functions
fun sub(num1: Int, num2: Int):Int = num1 - num2
fun sayHello(name: String) = println("Hello $name!!")



fun main() {
// FUNCTIONS
    greet()
    
    val greeting_msg = greeting()
    println(greeting_msg)
    
    val sum = add(20, 40)
    println(sum)

    val diff = sub(100, 50)
    println(diff)

    sayHello("Mark")
}
