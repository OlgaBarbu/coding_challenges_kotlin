
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test



/*
    Coding Challenge #6
    Write your first unit test for the generate password function
 */

fun main(args: Array<String>) {
    @Test
    fun testPasswordHasLowerCase(){
        val myPassword: String = generatePassword(8)
        var hasLowerCase = false
        println(myPassword)
        for(x in myPassword){
            if(x.isLowerCase())
                hasLowerCase = true
        }
        assertTrue(hasLowerCase)
    }
    @Test
    fun testPasswordHasUpperCase(){
        val myPassword: String = generatePassword(8)
        var hasUpperCase = false
        println(myPassword)
        for(p in myPassword){
            if(p.isUpperCase())
                hasUpperCase = true
        }
        assertTrue(hasUpperCase)
    }

    @Test
    fun testPasswordLength() {
        val myPassword: String = generatePassword(8)
        assertEquals(8, myPassword.length)
    }
    @Test
    fun testPasswordHasDigit() {
        val myPassword: String = generatePassword(8)
        var hasDigit = false
        println(myPassword)

        for (d in myPassword){
            if(d.isDigit() && !d.isLetter()){
                hasDigit = true
            }
        }
        assertTrue(hasDigit)

    }


    @Test
    fun testPasswordHasSpecialChar() {
        val myPassword: String = generatePassword(8)
        var hasSpecialChar =false
        println(myPassword)
        for(d in myPassword){
            if(!d.isLetterOrDigit())
                hasSpecialChar = true
        }
        assertTrue(hasSpecialChar)
    }


}

