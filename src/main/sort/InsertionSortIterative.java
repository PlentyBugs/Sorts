package main.sort;

public class InsertionSortIterative implements InsertionSort {

    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        sort(array, 0, array.length);
        return array;
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
