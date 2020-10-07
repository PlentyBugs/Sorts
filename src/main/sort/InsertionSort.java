package main.sort;

public interface InsertionSort extends SortAlgorithm {

    default void sort(int[] array, int left, int right) {
        for (int i = left + 1; i < right; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= left && array[j] > temp)
                array[j + 1] = array[j--];
            array[j + 1] = temp;
        }
    }
}
