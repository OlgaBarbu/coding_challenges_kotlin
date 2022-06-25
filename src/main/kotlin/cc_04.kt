/*
    Coding Challenge #4
    Write a program that prints all letters from the alphabet (upper case) with their respective position in the alphabet e.g. 1: a, 2: b
 */

fun main(args: Array<String>) {
    val alphabets = ('A'..'Z').toMutableList()

// Prints to the terminal the position and element at index
    for (i in 0..25) {
        print("$i: ")
        println(alphabets.elementAt(i))
    }
}
