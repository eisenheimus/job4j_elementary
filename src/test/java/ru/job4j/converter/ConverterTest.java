package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Euro() {
        double input = 180;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }

    @Test
    void whenConverter0RblThen0Euro() {
        double input = 0;
        double expected = 0;
        double output = Converter.rubleToEuro(input);
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }

    @Test
    void whenConverter140RblThen1dot555Euro() {
        double input = 140;
        double expected = 1.555;
        double output = Converter.rubleToEuro(input);
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }

    @Test
    void whenConverter150RblThen2Dollars() {
        double input = 150;
        double expected = 2;
        double output = Converter.rubleToDollar(input);
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }

    @Test
    void whenConverter0RblThen0Dollars() {
        double input = 0;
        double expected = 0;
        double output = Converter.rubleToDollar(input);
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
}