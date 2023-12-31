package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {4, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {10, 7, 5, 12, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 7, 10, 12, 15};
        assertThat(result).containsExactly(expected);
    }
}