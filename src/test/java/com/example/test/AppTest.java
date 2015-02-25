package com.example.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

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
    public void testAllMembersInSameGroup() throws Exception
    {
        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        App app = new App(names);
        List<String> actualA = app.createGroup("a");
        List<String> actualB = app.createGroup("b");
        List<String> actualC = app.createGroup("c");
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        assertEquals(actualA, expected);
        assertEquals(actualB, expected);
        assertEquals(actualC, expected);
    }

    public void testSecondGroup() throws Exception
    {
        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        App app = new App(names);
        List<String> actual = app.createGroup("e");
        List<String> expected = new ArrayList<String>();
        expected.add("d");
        expected.add("e");
        expected.add("f");
        assertEquals(actual, expected);
    }
}
