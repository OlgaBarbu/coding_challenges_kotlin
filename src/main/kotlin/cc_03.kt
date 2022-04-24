/*
    Coding Challenge #3
    Write a script which converts system input from lower case to uppercase and prints it
 */

fun main(args: Array<String>) {

    println("Please give your Message in: ")

    var input = readLine()

    if(input is String ) {
        print(input.uppercase())
    }

}