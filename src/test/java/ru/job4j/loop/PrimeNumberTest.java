package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void when5Then3() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void when11Then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void when2Then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void when25Then9() {
        int finish = 25;
        int result = PrimeNumber.calc(finish);
        int expected = 9;
        assertEquals(expected, result);
    }

    @Test
    void when49Then15() {
        int finish = 49;
        int result = PrimeNumber.calc(finish);
        int expected = 15;
        assertEquals(expected, result);
    }
}