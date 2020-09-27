public class MergeSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] v) {
        sort(v, 0, v.length);
        return v;
    }

    private void sort(int[] a, int left, int right) {
        if (right <= left + 1) return;
        int middle = left + (right - left) / 2;
        sort(a, left, middle);
        sort(a, middle, right);
        merge(a, left, middle, right);
    }

    private void merge(int[] a, int left, int middle, int right) {
        int i = left;
        int j = middle;
        int k = 0;
        int[] temp = new int[right - left];
        while (i < middle && j < right)
            if (a[i] <= a[j]) temp[k++] = a[i++];
            else temp[k++] = a[j++];
        while (i < middle) temp[k++] = a[i++];
        while (j < right) temp[k++] = a[j++];
        System.arraycopy(temp, 0, a, left, temp.length);
    }
}
