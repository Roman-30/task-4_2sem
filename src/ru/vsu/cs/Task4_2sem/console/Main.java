package ru.vsu.cs.Task4_2sem.console;

import ru.vsu.cs.Task4_2sem.logic.BubbleSort;
import ru.vsu.cs.Task4_2sem.logic.ShakerSort;
import ru.vsu.cs.Task4_2sem.util.MyArrayUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(0, 0);
        ShakerSort shakerSort = new ShakerSort(0, 0);

        int[] arr = MyArrayUtil.setArr();
        int[] arr1 = MyArrayUtil.setArr();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1) + "\n");

        bubbleSort.sort(arr);
        shakerSort.sort(arr1);

        System.out.println(Arrays.toString(arr) + "\n" + "Comparison Number --> "
                + bubbleSort.getComparisonNumber()
                + "\nExchanges number --> " + bubbleSort.getExchangesNumber() + "\n");
        System.out.println(Arrays.toString(arr1) + "\n" + "Comparison Number --> "
                + shakerSort.getComparisonNumber()
                + "\nExchanges number --> " + shakerSort.getExchangesNumber());
    }
}
