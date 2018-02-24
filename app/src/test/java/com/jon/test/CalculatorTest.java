package com.jon.test;

import com.jon.test.junit.Calculator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by jon on 1/22/18.
 * https://www.jianshu.com/p/03118c11c199
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

    @Test
    @Ignore("not implemented yet")      //忽略这个方法
    public  void  testFactorial(){
    }

    @Test(expected = IllegalArgumentException.class)
    public  void  test(){
        mCalculator.divide(4,0);
    }




}
