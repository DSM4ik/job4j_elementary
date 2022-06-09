package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP4K1() {
        double expected = 1;
        double p = 4;
        double k = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(1, out, 0);
    }

    @Test
    public void whenP5K2() {
        double expected = 1.38;
        double p = 5;
        double k = 2;
        double out = SqArea.square(5, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP3K4() {
        double expected = 0.36;
        double p = 3;
        double k = 4;
        double out = SqArea.square(3, 4);
        Assert.assertEquals(expected, out, 0.01);
    }

}
