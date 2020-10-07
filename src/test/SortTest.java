package test;

import main.sort.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortTest {

    private int[] array;
    public static final int[] CORRECT_ARRAY = new int[]{-7, -6, -1, 0, 1, 1, 4, 6, 8, 10, 18, 99};

    @BeforeEach
    public void prepareData() {
        array = new int[]{-6, 1, 8, 1, 6, 4, -1, 10, -7, 18, 99, 0};
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

    private void sort(SortAlgorithm algorithm) {
        algorithm.sort(array);
        Assertions.assertArrayEquals(array, CORRECT_ARRAY);
    }
}
