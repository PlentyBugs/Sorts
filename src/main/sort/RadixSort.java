package main.sort;

import java.util.Arrays;

public class RadixSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
            int[] tmp = new int[array.length];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                boolean move = array[i] << shift >= 0;
                if ((shift == 0) != move) tmp[j++] = array[i];
                else array[i - j] = array[i];
            }
            if (tmp.length - j >= 0)
                System.arraycopy(array, 0, tmp, j, tmp.length - j);
            System.arraycopy(tmp, 0, array, 0, tmp.length);
        }
        return array;
    }

    @Override
    public String toString() {
        return "Radix Sort";
    }
}
