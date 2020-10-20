package test;

import main.sort.mutable.*;
import org.junit.jupiter.api.Test;

public interface SortTest extends ArraySupplier {

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

    void sort(SortAlgorithm algorithm);
}
