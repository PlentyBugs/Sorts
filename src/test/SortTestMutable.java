package test;

import main.sort.SortAlgorithm;
import org.junit.jupiter.api.Assertions;

public interface SortTestMutable extends SortTest {
    default void sort(SortAlgorithm algorithm) {
        int[] correctArray = getCorrectArray();
        int[] array = getUnsortedArray();
        Assertions.assertArrayEquals(algorithm.sort(array), correctArray); // Test for a given array
        Assertions.assertArrayEquals(array, correctArray); // Test for a returning array
    }
}
