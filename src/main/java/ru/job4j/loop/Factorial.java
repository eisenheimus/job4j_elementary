package ru.job4j.loop;

public class Factorial {
    public static int calculate(int num) {
        int sum = 1;

        if (num == 0) {
            return 1;
        }

        for (int i = 1; i <= num; i++) {
            sum *= i;
        }

        return sum;
    }
}
