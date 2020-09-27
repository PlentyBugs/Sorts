public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] v) {
        sort(v, 0, v.length - 1);
        return v;
    }

    private void sort(int[] v, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(v, left, right);
            sort(v, left, pivotIndex - 1);  
            sort(v, pivotIndex + 1, right); 
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
}
