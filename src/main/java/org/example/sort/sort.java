package org.example.sort;

import java.util.Arrays;

public class sort {

    public static void insertionSortLinear(int[] arr) {
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                comparisons++;
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
        System.out.println("Сортировка вставками (линейный поиск): Количество сравнений: " + comparisons);
    }


    public static void insertionSortBinary(int[] arr) {
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int low = 0;
            int high = i - 1;
            int insertPosition = low;

            // Бинарный поиск

            while (low <= high) {
                comparisons++;

                int mid = (low + high) / 2;
                if (arr[mid] == key) {
                    insertPosition = mid;
                    break;
                } else if (arr[mid] < key) {
                    low = mid + 1;
                    insertPosition = low;
                } else {
                    high = mid - 1;
                    insertPosition = mid;
                }
            }


            for (int j = i - 1; j >= insertPosition; j--) {

                arr[j + 1] = arr[j];
            }
            arr[insertPosition] = key;
        }

        System.out.println("Сортировка вставками (бинарный поиск): Количество сравнений: " + comparisons);
    }


    public static void bubbleSort(int[] arr) {
        int comparisons = 0;
        int n = arr.length;
        boolean swapp;
        do {
            swapp = false;
            for (int i = 0; i < n - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapp = true;
                }
            }
            n--;
        } while (swapp);
        System.out.println("Пузырьковая сортировка: Количество сравнений: " + comparisons);
    }

    public static void shellSort(int[] arr) {
        int comparisons = 0;
        int l = arr.length;
        for (int gap = l / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < l; i++) {
                int key = arr[i];
                int j = i;
                comparisons++;
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }
        System.out.println("Сортировка Шелла: Количество сравнений: " + comparisons);
    }
}







































































































//    public static void shellSort(int[] arr) {
//        int comparisons = 0;
//        int l = arr.length;
//        for (int gap = l / 2; gap > 0; gap /= 2) {
//            for (int i = gap; i < l; i++) {
//                int key = arr[i];
//                int j = i;
//                comparisons++;
//                while (j >= gap && arr[j - gap] > key) {
//                    arr[j] = arr[j - gap];
//                    j -= gap;
//                }
//                arr[j] = key;
//            }
//        }
//        System.out.println("Сортировка Шелла: Количество сравнений: " + comparisons);
//    }