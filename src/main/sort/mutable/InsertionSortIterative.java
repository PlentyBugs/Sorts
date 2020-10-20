package main.sort.mutable;

public class InsertionSortIterative implements InsertionSort {

    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return array;
        sort(array, 0, array.length);
        return array;
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
