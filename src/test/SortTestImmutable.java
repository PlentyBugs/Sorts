package test;

import main.sort.mutable.SortAlgorithm;
import org.junit.jupiter.api.Assertions;

public interface SortTestImmutable extends SortTest {

    default void sort(SortAlgorithm algorithm) {
        int[] correctArray = getCorrectArray();
        int[] array = getUnsortedArray();
        Assertions.assertArrayEquals(algorithm.sort(array), correctArray); // Test for a given array
        Assertions.assertArrayEquals(array, getUnsortedArray()); // Test for a returning array
    }
}
