//this function replaces all the d with f and l with t

package com.stackroute.pe4;

public class CharacterReplacer {
    public static String replaceCharacter(String str)
    {
        return str.replaceAll("d|D","f").replaceAll("l|L","t");
    }
}
