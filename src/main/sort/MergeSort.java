package main.sort;

public interface MergeSort extends SortAlgorithm {

    default void merge(int[] array, int left, int middle, int right) {
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
}
