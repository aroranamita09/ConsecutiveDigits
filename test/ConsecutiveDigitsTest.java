package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveDigitsTest {

    ConsecutiveDigits obj;
    @Before
    public void setUp() throws Exception {
         obj = new ConsecutiveDigits();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkStatus() {
        assertEquals(true,obj.checkStatus(new String[]{"2","1"}));
        assertEquals(false,obj.checkStatus(new String[]{"4","65"}));
        assertEquals(true,obj.checkStatus(new String[]{"44","17"}));
        assertEquals(false,obj.checkStatus(new String[]{"5","49"}));
    }

    @Test
    public void checkConsecutive() {
        assertEquals("non consecutive order",obj.checkConsecutive("98,96,95,94,93",new String[]{"98","96"}));
        assertEquals("non consecutive order",obj.checkConsecutive("1,2,3,4,5,6,6",new String[]{"1","2"}));
        assertEquals("in consecutive order",obj.checkConsecutive("54,53,52,51,50,49,48",new String[]{"54","53"}));
    }
}
