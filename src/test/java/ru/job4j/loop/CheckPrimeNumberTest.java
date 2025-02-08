package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPrimeNumberTest {
    @Test
    void when5ThenTrue() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertTrue(result);
    }

    @Test
    void when4ThenFalse() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertFalse(result);
    }

    @Test
    void when1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertFalse(result);
    }

    @Test
    void when11ThenTrue() {
        int number = 11;
        boolean result = CheckPrimeNumber.check(number);
        assertTrue(result);
    }

    @Test
    void when25ThenFalse() {
        int number = 25;
        boolean result = CheckPrimeNumber.check(number);
        assertFalse(result);
    }

    @Test
    void when9ThenFalse() {
        int number = 9;
        boolean result = CheckPrimeNumber.check(number);
        assertFalse(result);
    }

    @Test
    void when49ThenFalse() {
        int number = 49;
        boolean result = CheckPrimeNumber.check(number);
        assertFalse(result);
    }
}