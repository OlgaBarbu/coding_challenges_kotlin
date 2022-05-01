import java.util.*

/*
    Coding Challenge #10
    Have the function compare(num1, num2) take both parameters being passed and
    return –1 if num1 is less than num2,
    otherwise return 1.
    If the parameter values are equal to each other then return 0.

 */

fun main(args: Array<String>) {
    compareBetweenNumbers()

} fun compareBetweenNumbers(){

    val num1: Int
    val num2: Int
    val s = Scanner(System.`in`)
    print("Give in your first number:")
    num1= s.nextInt()
    print("Give in your second number:")
    num2= s.nextInt()
   if(num1 == num2 )
       println("The numbers are equal "+ 0)
    if(num1 < num2)
        print("The first number is less than the second one " + -1)
     else if( num1 > num2)
         print("The first number is greater than " +1)




}