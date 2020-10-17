package main.sort;

import java.util.Stack;

public class PancakeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        Stack<Integer> flipStack = new Stack<>();
        int n = array.length;
        int dir = 1;
        while (n != 0) {
            int minI = 0;
            int maxI = 0;
            int max = array[0];
            int min = array[0];

            for (int i = 1; i < n; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minI = i;
                } else if (array[i] > max) {
                    max = array[i];
                    maxI = i;
                }
            }
            int bestXPos = dir == 1 ? maxI : minI;
            int altXPos = dir == 1 ? minI : maxI;
            boolean flipped = false;

            if (bestXPos == n-1) n--;
            else if (bestXPos == 0) flip(array, n-- - 1);
            else if (altXPos == n - 1) {
                dir = 1 - dir;
                n--;
                flipped = true;
            } else flip(array, bestXPos);
            if (flipped) flipStack.push(n);
        }
        while (!flipStack.isEmpty()) flip(array, flipStack.pop());
        return array;
    }

    public void flip(int[] array, int n) {
        for (int i = 0; i < (n + 1) / 2; i++)
            swap(array, i, n - i);
    }

    @Override
    public String toString() {
        return "Pancake Sort";
    }
}
