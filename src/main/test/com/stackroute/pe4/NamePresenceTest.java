package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NamePresenceTest {
    //string containing Harry
    @Test
    public void givenStringInputShouldReturnSuccessMessage()
    {
        NamePresence p=new NamePresence();
        String result=p.presenceChecker("This is Harry.");
        assertEquals("Is Harry here ? true",result);
    }
    //string not containing Harry
    @Test
    public void givenStringInputShouldReturnFailureMessage()
    {
        NamePresence p=new NamePresence();
        String result=p.presenceChecker("This is Hanry.");
        assertEquals("Is Harry here ? false",result);
    }

}