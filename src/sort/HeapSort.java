package sort;

public class HeapSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(array, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
        return array;
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if (l < n && array[l] > array[largest]) largest = l;
        if (r < n && array[r] > array[largest]) largest = r;
        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    @Override
    public String toString() {
        return "Heap Sort";
    }
}
