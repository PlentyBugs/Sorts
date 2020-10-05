package test;

import main.sort.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SortTest {

    private int[] array;
    public static final int[] CORRECT_ARRAY = new int[]{-7, -6, -1, 0, 1, 1, 4, 6, 8, 10, 18, 99};

    @BeforeEach
    public void prepareData() {
        array = new int[]{-6, 1, 8, 1, 6, 4, -1, 10, -7, 18, 99, 0};
    }

    @Test
    public void bubbleSortTest() {
        SortAlgorithm algorithm = new BubbleSort();
        sort(algorithm);
    }

    @Test
    public void shakerSortTest() {
        SortAlgorithm algorithm = new ShakerSort();
        sort(algorithm);
    }

    @Test
    public void insertionSortTest() {
        SortAlgorithm algorithm = new InsertionSort();
        sort(algorithm);
    }

    @Test
    public void selectionSortTest() {
        SortAlgorithm algorithm = new SelectionSort();
        sort(algorithm);
    }

    @Test
    public void heapSortTest() {
        SortAlgorithm algorithm = new HeapSort();
        sort(algorithm);
    }

    @Test
    public void mergeSortTest() {
        SortAlgorithm algorithm = new MergeSort();
        sort(algorithm);
    }

    @Test
    public void quickSortTest() {
        SortAlgorithm algorithm = new QuickSort();
        sort(algorithm);
    }

    private void sort(SortAlgorithm algorithm) {
        algorithm.sort(array);
        Assertions.assertArrayEquals(array, CORRECT_ARRAY);
    }
}
