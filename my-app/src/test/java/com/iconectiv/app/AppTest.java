package com.iconectiv.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAdd() {
    	//This is adding a comment
    	assertEquals(10,new Calculator().add(5, 5));
    }
    
    public void testSubtract() {
    	assertEquals(5,new Calculator().subtract(10, 5));
    }
    
    public void testMultiply() {
    	assertEquals(25,new Calculator().multiply(5, 5));
    }
    
    public void testDivide() {
    	assertEquals(5.0,new Calculator().divide(50, 10));
    }
}
