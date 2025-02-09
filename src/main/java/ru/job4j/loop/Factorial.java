package ru.job4j.loop;

public class Factorial {
    public static int calculate(int num) {
        int sum = 1;
        for (int i = 2; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}