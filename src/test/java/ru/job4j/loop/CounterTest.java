package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void when0and10then30() {
        int expected = 30;
        int out = Counter.sumByEven(0, 10);
        Assert.assertEquals(30, out);
    }
}