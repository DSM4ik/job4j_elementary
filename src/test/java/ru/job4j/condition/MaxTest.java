package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when1less4() {
        int expected = 4;
        int out = Max.max(1,4);
        Assert.assertEquals(expected, out, 0.0);
    }

    @Test
    public void when5more4() {
        int expected = 5;
        int out = Max.max(5,4);
        Assert.assertEquals(expected, out, 0.0);
    }

    @Test
    public void when5eq5() {
        int expected = 5;
        int out = Max.max(5,5);
        Assert.assertEquals(expected, out, 0.0);
    }
}