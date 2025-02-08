package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum += i;
        }

        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;

        if (start < 0) {
            start = 0;
        }
        if (finish < 0) {
            finish = 0;
        }

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        System.out.println(sum(1, 354));
        System.out.println(sum(10, 5));

        System.out.println(sumByEven(0, 5));
        System.out.println(sumByEven(10, 20));
        System.out.println(sumByEven(15, 50));
        System.out.println(sumByEven(-4, 4));
        System.out.println(sumByEven(4, -4));
    }
}
