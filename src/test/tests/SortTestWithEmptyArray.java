package test.tests;

import test.SortTest;

public class SortTestWithEmptyArray extends SortTest {
    @Override
    protected int[] getCorrectArray() {
        return new int[0];
    }

    @Override
    protected int[] getUnsortedArray() {
        return new int[0];
    }
}
