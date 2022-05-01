import java.util.*

/*
    Coding Challenge #14
    Have the function factorial(num) take the num parameter being passed and return the factorial of it.
    For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
    For the test cases, the range will be between 1 and 18 and the input will always be an integer.

 */

fun main(args: Array<String>) {
    factorial(1..18)

} fun factorial(num: IntRange) {
    var factOfNum: Long = 1

    var s = Scanner(System.`in`)
    print("Give in your number:")
    var num1 = s.nextInt()

    for ( i in 1..num1)

        // factorial of number equals factorial * i

      factOfNum *= i
        println(factOfNum)
}