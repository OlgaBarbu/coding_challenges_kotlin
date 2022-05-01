import java.util.Scanner

/*
    Coding Challenge #11
    Have the function alphabet_soup(input) take the input string parameter being passed
    and return the string with the letters in alphabetical order (ie. hello becomes ehllo).
    Assume numbers and punctuation symbols will not be included in the string.

 */

fun main(args: Array<String>) {
    alphabet_soup("soup")


} fun alphabet_soup(input:String){

    val s = Scanner(System.`in`)
    print("Your text goes here: ")
    val givenText = s.nextLine()

    val sortGivenText = givenText.toCharArray()
    println(sortGivenText.sorted())




}