
// adding collections as parameters to functions
fun nato(nato_list: List<String>){
    nato_list.forEach { println(it)}
}

fun main() {
// ARRAYS
    val myInterests = arrayOf("Programming", "cosmology", "Sci-fi books", "EDM music", "theoretical physics")
// size of array
    println(myInterests.size)
// choosing elements using index
    println(myInterests[2])
// similar to
    println(myInterests.get(0))
// array slicing
// NOTE: ranges are specified in this format: <starting index>..<ending index>
    println(myInterests.slice(0..3))

    println()

// ITERATION
// FOR loop
    for (i in 0..11) {
        println("line: $i")
    }

    println()

// iterating through an array using FOR loop
    for (interest in myInterests) {
        println(interest)
    }
// iterating through an array using <array>.forEachIndexed {}
    println("\nusing <Array>.forEachIndexed :")

    myInterests.forEachIndexed {index, interest ->
        println("${index + 1}) $interest")
    }

// LISTS
    val random_things = listOf("books", 3, 2.21, true)

// iterating through a list using <List>.forEachIndexed {}
    println("\nusing <List>.forEachIndexed :")
    random_things.forEachIndexed { index, thing ->
        println("${index + 1}) $thing")
    }

// MAPS (DICTIONARIES/HASH TABLES)
    val greet_diff_langs = mapOf(
            "english" to "Hello!",
            "french" to "Salut!",
            "Spanish" to "Hola!",
            "Japanese" to "こんにちは！",
            "Russian" to "Здравствуйте!"
    )
// iterating through a map using <Map>.forEach {}
    println("\nusing <Map>.forEachIndexed :")
    greet_diff_langs.forEach{ (lang, greeting) ->
        println("$lang : $greeting")
    }

// NOTE: Collections are immutable by default in Kotlin
// to make mutable collections
    // for lists
    val nato_alph = mutableListOf(
            "Alpha",
            "Bravo",
            "Charlie",
            "Delta",
            "Echo"
    )

    nato_alph.add("Foxtrot")
    println()
    nato_alph.forEachIndexed{index, alph ->
        println("${index + 1}) $alph")
    }


    // for maps
    val opposites = mutableMapOf(
            "Light" to "Dark",
            "Heavy" to "Light",
            "Full" to "Empty"
    )
    opposites.put("Tall", "short")

    println("\n")

    opposites.forEach { (key, value) -> println("$key : $value")}

// collections as function parameters
    println()
    nato(nato_alph)
}