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
 class PassGenerator
fun main(args: Array<String>) {

    generatePassword()
}
fun generatePassword() {
    val specialChar = "!/”§\$%&/?"

    val charachtersUp = ('A'..'Z').random()
    val charachtersSmall= ('a'..'z').random()
    val randomNumber = ('1'..'9').random()
    val randomChar = specialChar.random()

    val passCharSequence = listOf<Char>(charachtersUp, charachtersSmall,randomNumber,randomChar)



  print( passCharSequence.shuffled() + passCharSequence.shuffled())





}