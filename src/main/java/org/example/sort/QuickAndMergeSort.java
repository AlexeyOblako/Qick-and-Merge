package org.example.sort;

import java.util.Arrays;

class QuickAndMergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        System.out.println("Массив до сортировки (быстрая): " + Arrays.toString(arr1));
        quickSort.quickSort(arr1);
        System.out.println("Массив после сортировки (быстрая): " + Arrays.toString(arr1));
        System.out.println("Количество сравнений (быстрая): " + quickSort.getComparisonCount());
        System.out.println();

        System.out.println("Массив до сортировки (слиянием): " + Arrays.toString(arr2));
        mergeSort.mergeSort(arr2);
        System.out.println("Массив после сортировки (слиянием): " + Arrays.toString(arr2));
        System.out.println("Количество сравнений (слиянием): " + mergeSort.getComparisonCount());
    }
}