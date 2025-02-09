package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        if (ivan == nik) {
            return 1;
        }

        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }

        return month;
    }
}
