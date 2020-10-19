package test;

import main.sort.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface SortTest {
    default void sort(SortAlgorithm algorithm) {
        int[] correctArray = getCorrectArray();
        int[] array = getUnsortedArray();
        Assertions.assertArrayEquals(algorithm.sort(array), correctArray); // Test for a given array
        Assertions.assertArrayEquals(array, correctArray); // Test for a returning array
    }

    @Test
    default void bubbleSortTest() {
        sort(new BubbleSort());
    }

    @Test
    default void shakerSortTest() {
        sort(new ShakerSort());
    }

    @Test
    default void gnomeSortTest() {
        sort(new GnomeSort());
    }

    @Test
    default void cycleSortTest() {
        sort(new CycleSort());
    }

    @Test
    default void pigeonholeSortTest() {
        sort(new PigeonholeSort());
    }

    @Test
    default void combSortTest() {
        sort(new CombSort());
    }

    @Test
    default void insertionSortIterativeTest() {
        sort(new InsertionSortIterative());
    }

    @Test
    default void selectionSortTest() {
        sort(new SelectionSort());
    }

    @Test
    default void pancakeSortTest() {
        sort(new PancakeSort());
    }

    @Test
    default void heapSortTest() {
        sort(new HeapSort());
    }

    @Test
    default void mergeSortRecursiveTest() {
        sort(new MergeSortRecursive());
    }

    @Test
    default void quickSortIterativeTest() {
        sort(new QuickSortIterative());
    }

    @Test
    default void quickSortRecursiveTest() {
        sort(new QuickSortRecursive());
    }

    @Test
    default void quickSortDoublePivotTest() {
        sort(new QuickSortDualPivot());
    }

    @Test
    default void radixSortTest() {
        sort(new RadixSort());
    }

    int[] getCorrectArray();

    int[] getUnsortedArray();
}
