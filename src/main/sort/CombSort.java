package main.sort;

public class CombSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        int gap = n;
        boolean swapped = true;
        while (gap != 1 || swapped) {
            gap = Math.max((gap*10)/13, 1);
            swapped = false;
            for (int i = 0; i < n - gap; i++) {
                if (array[i] > array[i + gap]) {
                    swap(array, i, i + gap);
                    swapped = true;
                }
            }
        }
        return array;
    }

    @Override
    public String toString() {
        return "Comb Sort";
    }
}
