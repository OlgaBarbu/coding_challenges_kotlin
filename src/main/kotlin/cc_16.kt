import java.util.*

/*
    Coding Challenge #16
    Have the function letter_changes(input) take the input parameter being passed and modify it using the following algorithm.

    Replace every letter in the string with the letter following it in the alphabet (i e. c becomes d, z becomes a).
    Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.

 */

fun main(args: Array<String>) {

    var s = Scanner (System.`in`)
    println("Say something")
    var input = s.nextLine()

    alphabetShiftChar(input.toCharArray())

}fun alphabetShiftChar( s: CharArray ) {
    for (item in s.indices){
        if( !is_vowel(s[item])) {
            if(s[item] == 'z' || s[item] == 'Z'){
                s[item] ='A'
            }

        } else s[item] = s[item] + 1
    }
    for ( i in s.indices){
        if (s[i] == 'a' || s[i] == 'e' ||s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
        {
            var c:Char = Character.toUpperCase(s[i]);
            s[i] = c
        }
    }
    for (c in s){
        print(c)
    }
}fun is_vowel( s :Char): Boolean{
    if( s !='a' && s !='e'&& s !='i'&& s !='o' && s != 'u')
    {
        return false;
    }
    return true;
}













