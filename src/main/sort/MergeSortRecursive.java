package main.sort;

public class MergeSortRecursive implements MergeSort {

    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length);
        return array;
    }

    private void sort(int[] array, int left, int right) {
        if (right <= left + 1) return;
        int middle = left + (right - left) / 2;
        sort(array, left, middle);
        sort(array, middle, right);
        merge(array, left, middle, right);
    }

    @Override
    public String toString() {
        return "Merge Sort";
    }
}
