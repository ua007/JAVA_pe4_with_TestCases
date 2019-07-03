//transpose each word of the given string

package com.stackroute.pe4;

public class WordTransposer {
    public static String transposeWords(String str)
    {
        String[] strArray=str.split(" ");//split the string into array
        String reverseString="";
        for(int i=0;i<strArray.length;i++)
        {
            StringBuffer sb=new StringBuffer(strArray[i]);
            sb.reverse();
            reverseString=reverseString+sb+" ";
        }
        return reverseString.trim();

    }
}
