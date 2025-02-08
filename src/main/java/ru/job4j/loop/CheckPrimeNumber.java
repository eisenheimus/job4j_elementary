package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int n) {
        boolean result = true;

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
