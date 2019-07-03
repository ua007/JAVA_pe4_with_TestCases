package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrenceTest {
    //success test case
    @Test
    public void givenStringInputAndKeyShouldReturnTotalOccurrence()
    {
        CountOccurrence occ=new CountOccurrence();
        int result;
        result=occ.occurrenceCounter("Java is java again java again count number of occurrence",'a');
        assertEquals(10,result);
    }
    //failure test case
    @Test
    public void givenNullInputAndKeyShouldReturnZero()
    {
        CountOccurrence occ=new CountOccurrence();
        int result;
        result=occ.occurrenceCounter(null,' ');
        assertEquals(0,result);
    }

}