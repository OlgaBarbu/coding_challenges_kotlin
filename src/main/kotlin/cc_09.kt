import java.util.*

/*
    Coding Challenge #9
    Have the function first_reverse(input) take the input parameter being passed and return the string in reversed order.
    For example:
        if the input string is
        “Hello World and Coders” then your program should return the string
        “sredoC dna dlroW olleH”.

 */

fun main(args: Array<String>) {

 first_reverse("Hallo")

}    fun first_reverse(input:String){
         val s = Scanner(System.`in`)
            println("Your text goes here: ")
         val inputText = s.nextLine()
            println(inputText.reversed())
}