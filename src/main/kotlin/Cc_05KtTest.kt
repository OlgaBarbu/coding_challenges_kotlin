import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Cc_05KtTest {
    @Test
    fun testPasswordHasLowerCase(){
        val myPassword: String = getFulLengthPassword().toString()
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
        val myPassword: String = getFulLengthPassword().toString()
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
        val myPassword: String = getFulLengthPassword().toString()
        assertEquals(8, myPassword.length)
    }
    @Test
    fun testPasswordHasDigit() {
        val myPassword: String = getFulLengthPassword().toString()
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
        val myPassword: String = getFulLengthPassword().toString()
        var hasSpecialChar =false
        println(myPassword)
        for(d in myPassword){
            if(!d.isLetterOrDigit())
                hasSpecialChar = true
        }
        assertTrue(hasSpecialChar)
    }


}