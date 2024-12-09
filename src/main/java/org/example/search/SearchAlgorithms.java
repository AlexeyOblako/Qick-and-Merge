package org.example.search;

public class SearchAlgorithms {

    public static int linearSearch(int[] arr, int x) {
        int comparisons = 0; // Счетчик сравнений
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == x) {
                System.out.println("Линейный поиск: Количество сравнений: " + comparisons);
                return i;
            }
        }
        System.out.println("Линейный поиск: Количество сравнений: " + comparisons);
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        int comparisons = 0; // Счетчик сравнений
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;
            if (arr[mid] == x) {
                System.out.println("Бинарный поиск: Количество сравнений: " + comparisons);
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Бинарный поиск: Количество сравнений: " + comparisons);
        return -1;
    }
}