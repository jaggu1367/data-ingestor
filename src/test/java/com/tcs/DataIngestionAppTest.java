package com.tcs;

import static org.junit.Assert.*;  
import org.junit.Test;  

public class DataIngestionAppTest{
	

	@Test  
    public void testFindMax(){  
        assertEquals(4,DataIngestionApp.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,DataIngestionApp.findMax(new int[]{-12,-1,-3,-4,-2}));
        assertNotEquals(10,DataIngestionApp.findMax(new int[]{10,20,30}));
        assertEquals(30,DataIngestionApp.findMax(new int[]{10,20,30}));
    }  
	
	
}