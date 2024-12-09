package org.example.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchAlgorithmsTest {

    @Test
    void testLinearSearch_ElementFound() {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int expectedIndex = 3;
        int actualIndex = SearchAlgorithms.linearSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testLinearSearch_ElementNotFound() {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 5;
        int expectedIndex = -1;
        int actualIndex = SearchAlgorithms.linearSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testLinearSearch_EmptyArray() {
        int[] arr = {};
        int x = 10;
        int expectedIndex = -1;
        int actualIndex = SearchAlgorithms.linearSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearch_ElementFound() {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int expectedIndex = 3;
        int actualIndex = SearchAlgorithms.binarySearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearch_ElementNotFound() {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 5;
        int expectedIndex = -1;
        int actualIndex = SearchAlgorithms.binarySearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearch_EmptyArray() {
        int[] arr = {};
        int x = 10;
        int expectedIndex = -1;
        int actualIndex = SearchAlgorithms.binarySearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearch_DuplicateElements() {
        int[] arr = {2, 3, 4, 10, 10, 40};
        int x = 10;
        int expectedIndex = 4;
        int actualIndex = SearchAlgorithms.binarySearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearch_UnsortedArray() {
        int[] arr = {40, 2, 10, 3, 4};
        int x = 10;
        //  Бинарный поиск не гарантирует корректный результат на неотсортированном массиве
        int actualIndex = SearchAlgorithms.binarySearch(arr, x);
        //  Проверяем, что индекс  не равен -1 (в некоторых случаях может случайно найти элемент)
        assertNotEquals(-1, actualIndex);
    }

    // Интеграционные тесты
    @Test
    void testSearchAlgorithms_Integration() {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int linearIndex = SearchAlgorithms.linearSearch(arr, x);
        int binaryIndex = SearchAlgorithms.binarySearch(arr, x);
        assertEquals(linearIndex, binaryIndex);
    }
}
