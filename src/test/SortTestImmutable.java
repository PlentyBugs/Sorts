package test;

import main.sort.immutable.*;
import main.sort.mutable.SortAlgorithm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface SortTestImmutable extends SortTest {

    @Test
    default void bubbleSortTest() {
        sort(new BubbleSortImmutable());
    }

    @Test
    default void shakerSortTest() {
        sort(new ShakerSortImmutable());
    }

    @Test
    default void gnomeSortTest() {
        sort(new GnomeSortImmutable());
    }

    @Test
    default void cycleSortTest() {
        sort(new CycleSortImmutable());
    }

    @Test
    default void pigeonholeSortTest() {
        sort(new PigeonholeSortImmutable());
    }

    @Test
    default void combSortTest() {
        sort(new CombSortImmutable());
    }

    @Test
    default void insertionSortIterativeTest() {
        sort(new InsertionSortIterativeImmutable());
    }

    @Test
    default void selectionSortTest() {
        sort(new SelectionSortImmutable());
    }

    @Test
    default void pancakeSortTest() {
        sort(new PancakeSortImmutable());
    }

    @Test
    default void heapSortTest() {
        sort(new HeapSortImmutable());
    }

    @Test
    default void mergeSortRecursiveTest() {
        sort(new MergeSortRecursiveImmutable());
    }

    @Test
    default void quickSortIterativeTest() {
        sort(new QuickSortIterativeImmutable());
    }

    @Test
    default void quickSortRecursiveTest() {
        sort(new QuickSortRecursiveImmutable());
    }

    @Test
    default void quickSortDoublePivotTest() {
        sort(new QuickSortDualPivotImmutable());
    }

    @Test
    default void radixSortTest() {
        sort(new RadixSortImmutable());
    }

    default void sort(SortAlgorithm algorithm) {
        int[] correctArray = getCorrectArray();
        int[] array = getUnsortedArray();
        Assertions.assertArrayEquals(algorithm.sort(array), correctArray); // Test for a given array
        Assertions.assertArrayEquals(array, getUnsortedArray()); // Test for a returning array
    }
}
