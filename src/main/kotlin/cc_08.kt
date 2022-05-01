import java.util.*
import java.util.stream.Stream
import kotlin.math.sqrt
import kotlin.math.pow


/*
    Coding Challenge #8
    Write a function which returns a list of prime numbers below a given number by using the Sieve of Eratosthenes
 */

fun main(args: Array<String>) {

    val s = Scanner(System.`in`)
    print("Give a number in: ")
    val num = s.nextInt()

    print(sieveOfEratosthenes(num))

    }
    fun sieveOfEratosthenes(maxInput :Int): List<Int>{

            val numGiven = (2..maxInput).toMutableList()
            val limit = sqrt(maxInput.toDouble()).toInt()

                for (x in 2..limit)
                    numGiven -= x * x..maxInput step x
            return numGiven
        }



