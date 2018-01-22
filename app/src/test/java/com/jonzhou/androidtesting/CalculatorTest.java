package com.jonzhou.androidtesting;

import com.jonzhou.androidtesting.util.Calculator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jon on 1/22/18.
 */

public class CalculatorTest {
    Calculator mCalculator;

    @Before
    public  void  setup(){
        mCalculator = new Calculator();
    }

    @Test
    public void testAdd() throws Exception {
        int sum = mCalculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void  testMultiply() throws  Exception{
        int product = mCalculator.multiply(2,4);
        Assert.assertEquals(8,product);
    }
}
