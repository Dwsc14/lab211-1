package views;

import java.util.Arrays;
import java.util.Scanner;
import Controller.*;

public class MainMenu extends Menu {
    private int[] array;
    private Scanner sc = new Scanner(System.in);

    static String[] menu = { "Sort", "Search", "Exit" };

    {
        inputArray();
    }

    public MainMenu() {
        super("Menu", menu);
    }

    @Override
    public void excute(int n, int olen) {
        switch (n) {
            case 1:
                sortType();
                break;
            case 2:
                searchType();
                break;
        }
    }

    public void sortType() {
        String[] menuSort = { "Buddle sort", "Quick sort", "Exit" };
        Menu m = new Menu("Sort", menuSort) {
            public void excute(int n, int olen) {
                switch (n) {
                    case 1:
                        System.out.println("Bubble Sort");
                        System.out.println("Array after sorted: " + Arrays.toString(BubbleSort.run(array)));
                        break;
                    case 2:
                        System.out.println("Quick Sort");

                        System.out
                                .println("Sorted Array: " + Arrays.toString(QuickSort.run(array, 0, array.length - 1)));
                        break;
                }
            }
        };
        m.run();
    }

    public void searchType() {
        System.out.println(Arrays.toString(array));
        String[] menuSearch = { "Linear search", "Binary search", "Exit" };
        Menu m = new Menu("Search", menuSearch) {
            public void excute(int n, int olen) {
                switch (n) {
                    case 1:
                        System.out.println("Input the number: ");
                        System.out.println("Position: " + LinearSearch.run(sc.nextInt(), array));
                        break;
                    case 2:
                        System.out.print("Input the number: ");
                        System.out.println("Position: " + BinarySearch.run(sc.nextInt(), array));
                        break;
                }
            }
        };
        m.run();
    }

    public void inputArray() {
        System.out.println("Input array: ");
        String[] items = sc.nextLine().split(" ");
        this.array = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            this.array[i] = Integer.parseInt(items[i]);
        }
    }

}
