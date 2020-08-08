package com.example.appdz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummatorTest {
    private Summator summator;

    @Before
    public void before() {
        summator = new Summator();
    }

    @Test
    public void sumIsCorrect() {
        int a = 3;
        int b = 2;
        int c = summator.sum(a,b);
        Assert.assertEquals(c,5);

    }
    @Test
    public void sumIsNotCorrect() {
        int a = 3;
        int b = 2;
        int c = summator.sum(a,b);
        Assert.assertNotEquals(c,6);

    }
}