package main.sort;

public class InsertionSortIterative implements InsertionSort {

    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length);
        return array;
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
