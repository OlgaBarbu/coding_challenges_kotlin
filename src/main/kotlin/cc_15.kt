import java.util.*

/*
    Coding Challenge #15
    Have the function longest_word(sentence) take the sentence parameter being passed and return the largest word in the string.

    If there are two or more words that are the same length, return the first word from the string with that length.
    Ignore punctuation and assume sentence will not be empty.
    Sample Input “fun&!! time”, “I love dogs”


 */

fun main(args: Array<String>) {

    longest_word()

}fun longest_word() {

    println("Write something here:")
    var enteredSen = readLine()
    println("Your input :$enteredSen")
    val delimiter1 = " "
    val delimiter2 = ","
    val delimiter3 = "."
    val delimiter4 = "?"
    val delimiter5 = "!"

    var enteredSenSplit =
        enteredSen?.split( delimiter1, delimiter2, delimiter3, delimiter4, delimiter5, ignoreCase = true)

        var maxLength= ""

    if (enteredSenSplit != null) {
        for( i in 0 until enteredSenSplit.count()){
           var maxLen2 = enteredSenSplit[i]

            if(maxLen2.length > maxLength.length) {
                maxLength = maxLen2

            }
        }
    }
    println("The longest word is : $maxLength with the lenght of: ${maxLength.length} letters")
}

