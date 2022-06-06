import java.util.*

/*
    Coding Challenge #17
    Have the function kaprekars_constant(num) take the num parameter being passed which will be a 4-digit number with at least two distinct digits.

    Your program should perform the following routine on the number:
    Arrange the digits in descending order and in ascending order (adding zeroes to fit it to a 4-digit number)
    subtract the smaller number from the bigger number.
    Then repeat the previous step.Performing this routine will always cause you to reach a fixed number: 6174.
    then performing the routine on 6174 will always give you 6174 (7641 – 1467 = 6174).
    Your program should return the number of times this routine must be performed until 6174 is reached.
    For example: if num is 3524 your program should return 3 because of the following steps: (1) 5432 – 2345 = 3087, (2) 8730 – 0378 = 8352, (3) 8532 – 2358 = 6174.

 */

fun main(args: Array<String>) {

    val s = Scanner(System.`in`)

    print("Type a four digit number: ")
    val enteredString = s.nextInt()

    kaprekarsConstant(enteredString,0)

} fun kaprekarsConstant(num : Int, c: Int): Int {
    //Declaring variable to store iteration count, ascending and descending & initializing them to c, 0
    var count = c
    var asc = 0
    var desc = 0

    var newNum = num

    val array = IntArray(4)

    if(  num <= 999 || num >=10000 ){  //Throws exception if the input number is not a four digit lenght
         throw java.lang.Exception("That's not a four digit number, it should look like this: 1234, 4567, 7890, 0156.")
    }
    // Storing array of digits in inverse order.
   for(i in 0..3) {

        array[i] = newNum % 10

        newNum = newNum /10
   }
    // Sorting array, and storing it in ascending order and descending order.
     array.sort()

    for( j in 0..3) {

        asc = asc * 10 + array[j]
    }
    for (x in 3 downTo 0){
        desc = desc * 10 + array[x]
    }

    // Returns difference between numbers formed by descending and ascending order.
    val diff = desc - asc

     if( diff == num) {

        print("And Kaprekar's constant $num has been reached \n")
        // returning count of iterations when the constant is reached
        print("The number of times the routine repeated: $count")
        return diff
    }
    println("The difference between the biggest number $desc and smallest ${String.format("%04d",asc)} number is equal to: $diff")
    //Repeating until value reaches Kaprekar's constant.
    count++

    return kaprekarsConstant(diff, count)
}