package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 186;
        double expected = 98.899;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void womanWeight() {
        short in = 186;
        double expected = 87.399;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.001);

    }
}