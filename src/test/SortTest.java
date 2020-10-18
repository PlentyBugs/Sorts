package test;

import main.sort.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class SortTest {
    protected void sort(SortAlgorithm algorithm) {
        int[] correctArray = getCorrectArray();
        int[] array = getUnsortedArray();
        Assertions.assertArrayEquals(algorithm.sort(array), correctArray); // Test for a given array
        Assertions.assertArrayEquals(array, correctArray); // Test for a returning array
    }

    @Test
    public void bubbleSortTest() {
        sort(new BubbleSort());
    }

    @Test
    public void shakerSortTest() {
        sort(new ShakerSort());
    }

    @Test
    public void gnomeSortTest() {
        sort(new GnomeSort());
    }

    @Test
    public void cycleSortTest() {
        sort(new CycleSort());
    }

    @Test
    public void pigeonholeSortTest() {
        sort(new PigeonholeSort());
    }

    @Test
    public void combSortTest() {
        sort(new CombSort());
    }

    @Test
    public void insertionSortIterativeTest() {
        sort(new InsertionSortIterative());
    }

    @Test
    public void selectionSortTest() {
        sort(new SelectionSort());
    }

    @Test
    public void pancakeSortTest() {
        sort(new PancakeSort());
    }

    @Test
    public void heapSortTest() {
        sort(new HeapSort());
    }

    @Test
    public void mergeSortRecursiveTest() {
        sort(new MergeSortRecursive());
    }

    @Test
    public void quickSortIterativeTest() {
        sort(new QuickSortIterative());
    }

    @Test
    public void quickSortRecursiveTest() {
        sort(new QuickSortRecursive());
    }

    @Test
    public void quickSortDoublePivotTest() {
        sort(new QuickSortDualPivot());
    }

    @Test
    public void radixSortTest() {
        sort(new RadixSort());
    }

    protected abstract int[] getCorrectArray();

    protected abstract int[] getUnsortedArray();
}
