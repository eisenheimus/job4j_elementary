package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] sortedArray = SortSelected.sort(array);
        int leftIndex = 0;
        int rightIndex = sortedArray.length - 1;
        while (leftIndex < rightIndex) {
            int sum = array[leftIndex] + array[rightIndex];
            if (target == sum) {
                return new int[]{leftIndex, rightIndex};
            } else if (target > sum) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return new int[0];
    }
}