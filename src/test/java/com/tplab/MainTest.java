package com.tplab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest
{
    /**
     * test obliczen
     */
    @Test
    public void powinnoBycPrawda()
    {
        AbstractKsztalt ksztalt = new Prostokat("pr_1",5.0,2.0);
        AbstractKsztalt ksztalt1 = new Kolo("kolo_1",5.0);
        assertEquals(10, ksztalt.policzPole(),0.0);
        assertEquals(14, ksztalt.policzObwod(),0.0);
        assertEquals(78.53, ksztalt1.policzPole(),1.0);
        assertEquals(31.41, ksztalt1.policzObwod(),1.0);


    }
}
