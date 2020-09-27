public class HeapSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] v) {
        int n = v.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(v, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(v, 0, i);
            heapify(v, i, 0);
        }
        return v;
    }

    void heapify(int[] v, int n, int i) {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if (l < n && v[l] > v[largest]) largest = l;
        if (r < n && v[r] > v[largest]) largest = r;
        if (largest != i) {
            swap(v, i, largest);
            heapify(v, n, largest);
        }
    }
}
