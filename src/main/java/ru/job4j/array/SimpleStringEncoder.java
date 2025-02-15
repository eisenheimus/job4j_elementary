package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        if (input.length() == 1) {
            result = symbol + "";
        }
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result += counter > 1 ? symbol + "" + counter : symbol;
                counter = 0;
                symbol = input.charAt(i);
            }
            counter++;
            if (i == input.length() - 1) {
                result += counter > 1 ? symbol + "" + counter : symbol;
            }
        }
        return result;
    }
}