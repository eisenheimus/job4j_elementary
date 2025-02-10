package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] arr1 = new short[10];
        String[] arr2 = new String[100500];
        float[] arr3 = new float[40];

        System.out.println("Размер массива arr1 равен: " + arr1.length);
        System.out.println("Размер массива arr2 равен: " + arr2.length);
        System.out.println("Размер массива arr3 равен: " + arr3.length);
    }
}
