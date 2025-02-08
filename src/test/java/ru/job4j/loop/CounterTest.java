package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @DisplayName("When first value 0 and second value 5 then cycle in sum method must return 15")
    @Test
    void whenStart0andFinish5Then15() {
        short input1 = 0;
        short input2 = 5;
        int output = Counter.sum(input1, input2);
        short expected = 15;

        assertEquals(expected, output);
    }

    @DisplayName("When first value 10 and second value 5 then cycle in sum method must return 0")
    @Test
    void whenStart10andFinish5Then0() {
        short input1 = 10;
        short input2 = 5;
        int output = Counter.sum(input1, input2);
        short expected = 0;

        assertEquals(expected, output);
    }

    @DisplayName("When first value 10 and second value 5 then cycle in sum method must return 0")
    @Test
    void whenSumEvenStart2andFinish10Then30() {
        short input1 = 2;
        short input2 = 10;
        int output = Counter.sumByEven(input1, input2);
        short expected = 30;

        assertEquals(expected, output);
    }

    @DisplayName("When first value 10 and second value 5 then cycle in sum method must return 0")
    @Test
    void whenSumEvenStartMinus2andFinish10Then30() {
        short input1 = -2;
        short input2 = 10;
        int output = Counter.sumByEven(input1, input2);
        short expected = 30;

        assertEquals(expected, output);
    }
}