package main.sort;

public class PancakeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        sort(array, array.length, 1);
        return array;
    }

    private void sort(int[] array, int n, int dir) {
        if (array.length == 0) return;
        int minI = 0;
        int maxI = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < n; ++i) {
            if (array[i] < min) {
                min = array[i];
                minI = i;
            } else if (array[i] > max) {
                max = array[i];
                maxI = i;
            }
        }
        int bestXPos;
        int altXPos;
        if (dir == 1) {
            bestXPos = maxI;
            altXPos = minI;
        } else {
            bestXPos = minI;
            altXPos = maxI;
        }
        boolean flipped = false;

        if (bestXPos == n-1) n--;
        else if (bestXPos == 0) {
            flip(array, n - 1);
            --n;
        }
        else if (altXPos == n - 1) {
            dir = 1 - dir;
            n--;
            flipped = true;
        } else flip(array, bestXPos);

        sort(array, n, dir);

        if (flipped) flip(array, n);
    }

    public void flip(int[] array, int n) {
        for (int i = 0; i < (n + 1) / 2; ++i) {
            int tmp = array[i];
            array[i] = array[n-i];
            array[n-i] = tmp;
        }
    }
}
