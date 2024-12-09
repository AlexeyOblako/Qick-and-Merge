package org.example.sort;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr1 = {2,8,23,956,1,0,1,56,43,2,53,7,12,8,14};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

//        System.out.println("Массив до сортировки (л п): " + Arrays.toString(arr1));// вставка + лин
//        sort.insertionSortLinear(arr1);
//        System.out.println("Массив после сортировки (л п): " + Arrays.toString(arr1));
//        System.out.println();
//
//        System.out.println("Массив до сортировки (б п): " + Arrays.toString(arr2));// вставка + бин
//        sort.insertionSortBinary(arr2);
//        System.out.println("Массив после сортировки (б п): " + Arrays.toString(arr2));


        System.out.println("Массив до сортировки (пузырьковая): " + Arrays.toString(arr1));
        sort.bubbleSort(arr1);
        System.out.println("Массив после сортировки (пузырьковая): " + Arrays.toString(arr1));
        System.out.println();

        System.out.println("Массив до сортировки (Шелл): " + Arrays.toString(arr2));
        sort.shellSort(arr2);
        System.out.println("Массив после сортировки (Шелл): " + Arrays.toString(arr2));
        System.out.println();

    }
}