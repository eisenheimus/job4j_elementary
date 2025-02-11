package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 25, 33, 99, 354};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertEquals(expected, result);
    }
}