package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(15.0, 2.0, 2.0);
        assertFalse(result);
    }
}