package main;

import main.sort.*;

public class Main {
    public static void main(String[] args) {
        int n = 30000;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        System.out.println("Array Size: " + n + "\n");
        for (SortAlgorithm sort : new SortAlgorithm[]{
            new BubbleSort(),
            new ShakerSort(),
            new GnomeSort(),
            new CombSort(),
            new InsertionSortIterative(),
            new SelectionSort(),
            new HeapSort(),
            new MergeSortRecursive(),
            new QuickSortRecursive(),
            new QuickSortIterative(),
            new QuickSortDualPivot()
        }) {
            int[] arr = new int[array.length];
            System.arraycopy(array, 0, arr, 0, arr.length);
            long time = System.nanoTime();
            sort.sort(arr);
            System.out.println(sort + ": " + (System.nanoTime() - time) / 1_000_000.0 + "ms");
        }
    }
}