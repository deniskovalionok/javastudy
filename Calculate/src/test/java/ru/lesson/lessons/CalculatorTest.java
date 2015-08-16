package ru.lesson.lessons;

import junit.framework.Assert;
import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Den on 10.08.2015.
 */
public class CalculatorTest extends TestCase {

    public void testSumm() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.summ(1, 1));
    }

    public void testSubst() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subst(4,2));
    }

    public void testMul() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.mul(2,2));

    }

    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(4,2));

    }
    public void testDeg() throws Exception {
    Calculator calculator = new Calculator();
        assertEquals(27.0, calculator.deg(3,3));
    }
}