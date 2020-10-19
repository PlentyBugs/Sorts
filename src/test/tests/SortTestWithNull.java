package test.tests;

import test.SortTest;

public class SortTestWithNull implements SortTest {

    @Override
    public int[] getCorrectArray() {
        return null;
    }

    @Override
    public int[] getUnsortedArray() {
        return null;
    }
}
