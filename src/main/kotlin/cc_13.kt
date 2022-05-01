import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes


/*
    Coding Challenge #13
    Have the function time_convert(minutes) take the minutes parameter being passed
    and return the number of hours and minutes the parameter converts to
    (ie. if minutes= 63 then the output should be 1:03).
    Separate the number of hours and minutes with a colon.
 */

fun main(args: Array<String>) {

    time_convert()

} fun time_convert(){

    val s = Scanner(System.`in`)
    print("Number of minutes: ")
    var givenTime: Int = s.nextInt()

    var hours = givenTime / 60
    var minutes = givenTime % 60



    println("$givenTime Given Time  = $hours : $minutes")

}



