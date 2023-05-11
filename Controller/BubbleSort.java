package Controller;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static Scanner scanner = new Scanner(System.in);

    public static int[] run(int[] arrA) {
        int count = 1;
        System.out.println("Original Array: " + Arrays.toString(arrA));
        int size = arrA.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // check the adjacent elements
                if (arrA[j] > arrA[j + 1]) {
                    int temp = arrA[j];
                    arrA[j] = arrA[j + 1];
                    arrA[j + 1] = temp;
                }
            }
            System.out.println("Step " + count + " : " + Arrays.toString(arrA));
            count++;
        }
        return arrA;
    }
}