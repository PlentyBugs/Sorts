package main.sort;

import java.util.Arrays;

public class PigeonholeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return array;
        int min = array[0];
        int max = array[0];
        int range, i, j, index;

        for (int k : array) {
            max = Math.max(k, max);
            min = Math.min(k, min);
        }

        range = max - min + 1;
        int[] pHole = new int[range];
        Arrays.fill(pHole, 0);

        for(i = 0; i < array.length; i++)
            pHole[array[i] - min]++;

        index = 0;

        for(j = 0; j < range; j++)
            while(pHole[j]-->0)
                array[index++] = j + min;

        return array;
    }

    @Override
    public String toString() {
        return "Pigeonhole sort";
    }
}
