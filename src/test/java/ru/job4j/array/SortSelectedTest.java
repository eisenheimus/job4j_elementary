package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortWhen34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWhen111Minus2ThenMinus2111() {
        int[] data = new int[] {11, 1, -2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-2, 1, 11};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWhen121040Then012410() {
        int[] data = new int[] {1, 2, 10, 4, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 4, 10};
        assertThat(result).containsExactly(expected);
    }
}
