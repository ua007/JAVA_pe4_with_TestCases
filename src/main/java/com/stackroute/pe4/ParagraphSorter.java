//sort the words of the input paragraph

package com.stackroute.pe4;

import java.util.Arrays;

public class ParagraphSorter {
    public static String sortPara(String para)
    {
        String[] paraArray=para.split(" ");//split the string into array
        Arrays.sort(paraArray);
        String str="";
        for(String s:paraArray)
        {
            str=str+s+" ";
        }
        return str.trim();
    }
}
