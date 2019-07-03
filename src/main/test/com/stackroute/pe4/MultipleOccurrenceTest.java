package com.stackroute.pe4;

import com.stackroute.pe4.MultipleOccurrence;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {

    //success test case
    @Test
    public void findMultipleoOccurences() {
        MultipleOccurrence ob=new MultipleOccurrence();

        String result= ob.findMultipleoOccurences("ishapharryhhh ry","ry");;
        assertEquals("I found the text ry starting at index 8 and ending at index 10I found the text ry starting at index 14 and ending at index 16",result);
    }
}