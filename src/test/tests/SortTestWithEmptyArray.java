package test.tests;

import test.SortTest;

public class SortTestWithEmptyArray implements SortTest {
    @Override
    public int[] getCorrectArray() {
        return new int[0];
    }

    @Override
    public int[] getUnsortedArray() {
        return new int[0];
    }
}
