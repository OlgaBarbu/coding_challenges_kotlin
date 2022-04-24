import kotlin.random.Random

/*
    Coding Challenge #2
    Write a program that prints 10 random numbers between 1 and 10
 */

fun main(args: Array<String>) {
    val randNum = List(10) { Random.nextInt(0,10) }
    println(randNum)

}