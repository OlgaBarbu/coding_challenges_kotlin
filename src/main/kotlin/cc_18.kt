/*
    Coding Challenge #18
    Have the function simple_symbols(input) take the input parameter being passed.

    Determine if it is an acceptable sequence by either returning the string true or false.
    The input parameter will be composed of + and = symbols with several characters between them (ie. ++d+===+c++==a)
    For the string to be true each letter must be surrounded by a + symbol.
    So the string to the left would be false, because a is not surrounded by + symbols.
    The string will not be empty and will have at least one letter.

 */

fun main(args: Array<String>) {

    // Examples of Strings to test
    val simpleNotSimple = "+"       // false
    val simple = "+a+=+c+d+==+a+"   // true
    val simple1 = null              // false
    val simple2 = "+a+"             // true
    val simple3 = "++d+===+c++==a"  // false
    val simple4 = ""                // false

    println(simpleSymbols(simpleNotSimple))
    println(simpleSymbols(simple))
    println(simpleSymbols(simple1.toString()))
    println(simpleSymbols(simple2))
    println(simpleSymbols(simple3))
    println(simpleSymbols(simple4))
}

fun simpleSymbols(string: String): Boolean {
    // Removing white spaces around String
    val givenSymbols = string.trim()

    // filters letters from String
    val result = givenSymbols.filter { it.isLetter() }

    // If the String is empty or doesn't contain a letter then returns false
    if (givenSymbols.isEmpty() || result == "") {
        return false
    }
    // loop through entire string
    for (i in givenSymbols.indices) {
        val lastIndex = givenSymbols.lastIndex

        // If the first and last symbol is a letter return false
        when {
            givenSymbols[0].isLetter() -> return false
            givenSymbols[lastIndex].isLetter() -> return false
        }
        //Checks if character is a letter and is surrounded by a + symbol, if not it's not a valid String
        if (givenSymbols[i].isLetter() && (givenSymbols[i - 1] != '+' || givenSymbols[i + 1] != '+')) {
            return false
        }
    }
    return true
}
