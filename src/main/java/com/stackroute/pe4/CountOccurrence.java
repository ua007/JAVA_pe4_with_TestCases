//this function counts the occurrence of a given character in a string

package com.stackroute.pe4;

import java.util.*;
public class CountOccurrence {
    public static int occurrenceCounter(String str,Character key)
    {
        //failure check
        if(str==null || key==' ')
            return 0;

        String keyCopy=key.toString();
        String strCopy=str.toLowerCase().replaceAll(keyCopy,"");

        return str.length()-strCopy.length();
    }
}
