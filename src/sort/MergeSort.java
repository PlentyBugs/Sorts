package sort;

public class MergeSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length);
        return array;
    }

    private void sort(int[] array, int left, int right) {
        if (right <= left + 1) return;
        int middle = left + (right - left) / 2;
        sort(array, left, middle);
        sort(array, middle, right);
        merge(array, left, middle, right);
    }

    private void merge(int[] array, int left, int middle, int right) {
        int i = left;
        int j = middle;
        int k = 0;
        int[] temp = new int[right - left];
        while (i < middle && j < right)
            if (array[i] <= array[j]) temp[k++] = array[i++];
            else temp[k++] = array[j++];
        while (i < middle) temp[k++] = array[i++];
        while (j < right) temp[k++] = array[j++];
        System.arraycopy(temp, 0, array, left, temp.length);
    }

    @Override
    public String toString() {
        return "Merge Sort";
    }
}
