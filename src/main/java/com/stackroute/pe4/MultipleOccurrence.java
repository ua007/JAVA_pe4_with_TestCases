//find out the multiple occurrences of the given word in a string using Matcher methods.

package com.stackroute.pe4;
import java.util.regex.*;

public class MultipleOccurrence {
    public String findMultipleoOccurences(String text, String p) {
        String output="";
        while (true) {

            Pattern pattern = Pattern.compile(p);

            Matcher matcher = pattern.matcher(text);
            boolean found = false;
            while (matcher.find()) {
                output=output+"I found the text " + matcher.group() + " starting at index " +
                        matcher.start() + " and ending at index " + matcher.end();
                found = true;
            }
            if (!found) {
                return "No match found.";


            }
            return output;
        }
    }
}