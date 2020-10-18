package main.sort;

public class TimSort implements MergeSort, InsertionSort {
    private final static int RUN = 32;

    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return array;
        // todo: Implement TimSort
        return array;
    }

    @Override
    public String toString() {
        return "TimSort";
    }
}
