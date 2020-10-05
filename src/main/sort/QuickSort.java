package main.sort;

public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            sort(array, left, pivotIndex - 1);
            sort(array, pivotIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];  
        int partitionIndex = left; 

        for (int i = left; i < right; i++)
            if (array[i] <= pivot)
                swap(array, i, partitionIndex++);

        swap(array, partitionIndex, right); 

        return partitionIndex;
    }

    @Override
    public String toString() {
        return "Quick Sort";
    }
}
