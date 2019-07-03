package com.stackroute.pe4;

import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterReplacerTest {
    // success test cases
    @Test
    public void givenStringInputShouldReturnReplacedString()
    {
        CharacterReplacer str=new CharacterReplacer();
        String result;
        result=str.replaceCharacter("daily dry");
        assertEquals("faity fry",result);
    }
    //failure test case
    @Test
    public void givenNullShouldReturnNullString()
    {
        CharacterReplacer str=new CharacterReplacer();
        String result;
        result=str.replaceCharacter("");
        assertEquals("",result);
    }

}