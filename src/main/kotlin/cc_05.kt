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
    println(generatePassword(8))

}

fun generatePassword(len: Int): String {

    val passChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~`!@#$%^&*()-_=+[{]}|;:',<.>/?\""

    val random = Random(System.nanoTime())
    val password = StringBuilder()

    for (i in 0 until len) {
        val randomChar = random.nextInt(passChar.length)
        password.append(passChar[randomChar])
    }


    return password.toString()
}


