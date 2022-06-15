/*
    Coding Challenge #19
    Have the function questions_marks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks.

    Check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
    If so, then your program should return the string true, otherwise it should return the string false.
    If there aren’t any two numbers that add up to 10 in the string, then your program should return false as well.
    For example: if str is “arrb6???4xxbl5???eee5” then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

 */

fun main(args: Array<String>) {
    var exp = "arrb6???4xxbl5???eee5"
    var expSomeMore = "arfvb3???7fred4??7"
    println(questionMarks(exp))
    println(questionMarks(expSomeMore))
}

fun questionMarks(str: String): Boolean {
    var matchFound = false
    var counter = 0
    var secondNum = -1

    for(char in str )
    {
        if(char.isDigit() ) {
            val firstNumber = Integer.parseInt(char.toString())
            val sum = firstNumber + secondNum
            secondNum = firstNumber
            if( sum != 10) {
                counter = 0
            }
            matchFound = counter == 3
        } else if  (char == '?')
            counter++
    }
    return matchFound
}