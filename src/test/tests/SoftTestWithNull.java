package test.tests;

import test.SortTest;

public class SoftTestWithNull extends SortTest {

    @Override
    protected int[] getCorrectArray() {
        return null;
    }

    @Override
    protected int[] getUnsortedArray() {
        return null;
    }
}
