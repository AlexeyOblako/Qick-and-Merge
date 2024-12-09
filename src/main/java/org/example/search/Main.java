package org.example.search;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 4;

        int index = SearchAlgorithms.linearSearch(arr, x);
        if (index != -1) {
            System.out.println("Линейный поиск: Элемент " + x + " найден на позиции " + index);
        } else {
            System.out.println("Линейный поиск: Элемент " + x + " не найден");
        }
        System.out.println();


        index = SearchAlgorithms.binarySearch(arr, x);
        if (index != -1) {
            System.out.println("Бинарный поиск: Элемент " + x + " найден на позиции " + index);
        } else {
            System.out.println("Бинарный поиск: Элемент " + x + " не найден");
        }
        System.out.println();

    }
}