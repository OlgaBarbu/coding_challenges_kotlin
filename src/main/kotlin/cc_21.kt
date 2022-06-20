/*
    Coding Challenge #21
    Write a function which sorts an integer array with bubblesort
 */

fun bubblesort(arr: IntArray): IntArray {
    var swap = true
    while (swap) {
        swap = false
        for (i in 0 until arr.size - 1) {
            if (arr[i] > arr[i + 1]) {
                var temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp

                swap = true
            }
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val list = bubblesort(intArrayOf(2, 3, 6, 1, 9, 4))
    for (i in list) {
        print(i)
    }
}
