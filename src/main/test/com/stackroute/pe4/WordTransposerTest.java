package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTransposerTest {
    //Success test case
    @Test
    public void givenStringInputShouldReturnTransposeString()
    {
        WordTransposer str=new WordTransposer();
        String result;
        result=str.transposeWords("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    //failure test case
    @Test
    public void givenNullShouldReturnNullString()
    {
        WordTransposer str=new WordTransposer();
        String result;
        result=str.transposeWords("");
        assertEquals("",result);
    }

}