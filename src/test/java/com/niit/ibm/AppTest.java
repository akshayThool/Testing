package com.niit.ibm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private static Calculator calc;
    private static int count = 1;

    @BeforeClass
    public static void init()
    {
        calc = new Calculator();
        System.out.println("Before execute "+ count);
        count++;
    }

    @AfterClass
    public static void close()
    {
        calc = null;
    }
   /*
    @Before
    public void init1()
    {
        calc = new Calculator();
        System.out.println("Before execute "+ count);
        count++;
    }
    @After
    public void close1()
    {
        calc = null;
    }
*/
    @Test
    public void shouldAnswerWithTrue()
    {

        double result = calc.division(20, 4);

        assertEquals(5, result, 0.00);

        assertTrue( true );
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZero()
    {

        calc.division(20, 0);
    }
}
