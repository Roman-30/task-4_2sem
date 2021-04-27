package ru.vsu.cs.Task4_2sem.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.Task4_2sem.logic.BubbleSort;
import ru.vsu.cs.Task4_2sem.logic.Sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {
    Sort bubbleSort = new BubbleSort(0, 0);

    @Test
    public void performanceTestDemo() {
        int[] soursArray = {45, 2, 13, 1, 32, 6, 45, 40, 10, 17, 37, 34, 26, 19, 9, 47, 3, 47, 42, 42};
        bubbleSort.sort(soursArray);
        int[] testArray = {1, 2, 3, 6, 9, 10, 13, 17, 19, 26, 32, 34, 37, 40, 42, 42, 45, 45, 47, 47};
        Assert.assertArrayEquals(testArray, soursArray);
    }

    @Test
    public void comparisonNumberTest() {
        int testNumber = 189;
        int[] soursArray = {45, 2, 13, 1, 32, 6, 45, 40, 10, 17, 37, 34, 26, 19, 9, 47, 3, 47, 42, 42};
        bubbleSort.sort(soursArray);
        int outputNumber = bubbleSort.getComparisonNumber();
        Assert.assertEquals(testNumber, outputNumber);
    }

    @Test
    public void exchangesNumberTest() {
        int testNumber = 73;
        int[] soursArray = {45, 2, 13, 1, 32, 6, 45, 40, 10, 17, 37, 34, 26, 19, 9, 47, 3, 47, 42, 42};
        bubbleSort.sort(soursArray);
        int outputNumber = bubbleSort.getExchangesNumber();
        Assert.assertEquals(testNumber, outputNumber);
    }

    @Test
    public void exchangesNumberTest1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
             list.add(i);
        }
        List<Integer> list1 = new ArrayList<>(list);
        int[] soursArray = {45, 2, 13, 1, 32, 6, 45, 40, 10, 17, 37, 34, 26, 19, 9, 47, 3, 47, 42, 42};
        int[] soursArray1 = {45, 2, 13, 1, 32, 6, 45, 40, 10, 17, 37, 34, 26, 19, 9, 47, 3, 47, 42, 42};
        Assert.assertArrayEquals(soursArray, soursArray1);
        Assert.assertArrayEquals(new List[]{list}, new List[]{list1});
    }
}