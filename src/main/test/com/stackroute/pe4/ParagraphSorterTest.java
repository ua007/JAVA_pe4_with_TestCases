package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphSorterTest {
    //success test case
    @Test
    public void givenParagraphInputShouldReturnSortedString()
    {
        ParagraphSorter para=new ParagraphSorter();
        String result;
        result=para.sortPara("a quick brown fox jumps over the lazy dog");
        assertEquals("a brown dog fox jumps lazy over quick the",result);
    }
    @Test
    public void givenNullInputShouldReturnNullString()
    {
        ParagraphSorter para=new ParagraphSorter();
        String result;
        result=para.sortPara("");
        assertEquals("",result);
    }

}