import java.util.*

/*
    Coding Challenge #7
    Write a function is_even(num) which returns true if value is even
 */

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    print("Enter a number: ")

    val num = input.nextInt()


        if (num % 2 == 0)
            println("$num is even")
        else   println("$num is odd")

}