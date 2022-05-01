import kotlin.random.Random

/*
    Coding Challenge #5
    Write a function which generates random passwords

    8 characters in length
    Must contain at least one alphabet lower case
    Must contain at least one alphabet upper case
    Must contain at least one digit
    Must contain at least one special character from !”§$%&/?

 */

fun main(args: Array<String>) {

   getFulLengthPassword()
}

fun generatePassword() {

    val specialRandomChar = "!/”§\$%&/?".random()
    val randomCharachtersUp = ('A'..'Z').random()
    val randomCharachtersSmall = ('a'..'z').random()
    val randomNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9).random()


    var passCharSequence = listOf(randomCharachtersUp,randomCharachtersSmall,randomNumber,specialRandomChar)
    var passChar = passCharSequence

    for (i in passCharSequence ) {
        print("$i")

    }
}
fun getFulLengthPassword() {
    generatePassword()
    generatePassword()



}