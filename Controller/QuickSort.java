package Controller;

import java.util.Scanner;

public class QuickSort {
    static Scanner scanner = new Scanner(System.in);

    public static int[] run(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            run(arr, left, pivot - 1);
            run(arr, pivot + 1, right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
}