package main.sort;

public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j])
                    swap(array, i, j);
        return array;
    }

    @Override
    public String toString() {
        return "Bubble Sort";
    }
}
