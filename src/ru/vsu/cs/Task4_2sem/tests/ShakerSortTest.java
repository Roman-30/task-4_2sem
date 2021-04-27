package ru.vsu.cs.Task4_2sem.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.Task4_2sem.logic.ShakerSort;
import ru.vsu.cs.Task4_2sem.logic.Sort;

public class ShakerSortTest {
    Sort shakerSort = new ShakerSort(0, 0);

    @Test
    public void sortArray() {
        int[] soursArray = {44, 12, 20, 26, 21, 16, 34, 4, 26, 34, 47, 14, 25, 36, 14, 28, 12, 5, 19, 30};
        shakerSort.sort(soursArray);
        int[] testArray = {4, 5, 12, 12, 14, 14, 16, 19, 20, 21, 25, 26, 26, 28, 30, 34, 34, 36, 44, 47};
        Assert.assertArrayEquals(testArray, soursArray);
    }

    @Test
    public void comparisonNumberTest() {
        int testNumber = 190;
        int[] soursArray = {44, 12, 20, 26, 21, 16, 34, 4, 26, 34, 47, 14, 25, 36, 14, 28, 12, 5, 19, 30};
        shakerSort.sort(soursArray);
        int outputNumber = shakerSort.getComparisonNumber();
        Assert.assertEquals(testNumber, outputNumber);
    }

    @Test
    public void exchangesNumberTest() {
        int testNumber = 99;
        int[] soursArray = {44, 12, 20, 26, 21, 16, 34, 4, 26, 34, 47, 14, 25, 36, 14, 28, 12, 5, 19, 30};
        shakerSort.sort(soursArray);
        int outputNumber = shakerSort.getExchangesNumber();
        Assert.assertEquals(testNumber, outputNumber);
    }
}