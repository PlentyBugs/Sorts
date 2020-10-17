package test.tests;

import test.SortTest;

public class SortTestWithSmallArray extends SortTest {

    @Override
    protected int[] getCorrectArray() {
        return new int[]{-7, -6, -1, 0, 1, 1, 4, 6, 8, 10, 18, 99};
    }

    @Override
    protected int[] getUnsortedArray() {
        return new int[]{-6, 1, 8, 1, 6, 4, -1, 10, -7, 18, 99, 0};
    }
}
