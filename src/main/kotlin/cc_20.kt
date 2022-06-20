/*
    Coding Challenge #20
    Write a function which calculates mean, median and mode of a given integer array
 */


fun main(args: Array<String>) {
    var someNums = intArrayOf(2, 3, 6, 5, 4, 10, 9, 1, 1, 6, 8)
    println("MEAN: " + getMean(someNums))
    println("MODE: " + getMode(someNums))
    println("MEDIAN:" + getMedian(someNums))

}

// Method to calculate the Mean of an array = (sum of all elements) / (number of elements)
fun getMean(num: IntArray): Int {
    var sum = 0
    for (i in 0 until num.size) {
        sum += num[i]
    }
    return sum / num.size
// Method to calculate the Median on an array
}

fun getMedian(num: IntArray): Double {
    // Sorting array in ascending order, in order to find middle element
    var sorted = num.sorted()
    print(sorted)

    //  Checks if the number of element is even or odd
    return if (sorted.size % 2 == 0) {
        println(" the number of element is even " + sorted.size)

        // the average of the two middle elements.
        ((sorted[sorted.size / 2].toDouble() + sorted[sorted.size / 2 - 1].toDouble()) / 2)
    } else {
        println("the number of elements is odd " + sorted.size)

        sorted[(sorted.size / 2)].toDouble()
    }

}

// Find the most repeated element
fun getMode(num: IntArray): Int {
    var previous = num[0]
    var mod = num[0]
    var count = 1
    var nextCount = 1

    for (i in 1 until num.size) {
        //Store count of each element of input array
        if (num[i] == previous) {
            count++
        } else {
            // mode is the index with maximum count
            if (count > nextCount) {
                mod = num[i - 1]
                nextCount = count
            }
            previous = num[i]
            count = 1
        }
    }
    return if (count > nextCount) {
        num[num.size - 1]
    } else {
        mod
    }
}