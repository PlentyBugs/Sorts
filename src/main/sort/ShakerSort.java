package main.sort;

public class ShakerSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        int left = 0;
        int right = array.length;
        while (left <= right) {
            for (int i = --right; i > left; i--)
                if (array[i - 1] > array[i])
                    swap(array, i - 1, i);
            for (int i = ++left; i < right; i++)
                if (array[i] > array[i + 1])
                    swap(array, i + 1, i);
        }
        return array;
    }

    @Override
    public String toString() {
        return "Shaker Sort";
    }
}
