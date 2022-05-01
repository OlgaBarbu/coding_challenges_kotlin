import java.util.Scanner

/*
    Coding Challenge #12
    Have the function simple_adding(num) add up all the numbers from 1 to num.

    For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.
    For the test cases, the parameter num will be any number from 1 to 1000.

 */

fun main(args: Array<String>) {
    simple_adding(0)

} fun simple_adding (num: Int) {
        var sum = 0
        var s = Scanner(System.`in`)
        print("Give a number in: ")
        var x = s.nextInt()

    for(i in 1..x)
        sum += i
    println(sum)
}