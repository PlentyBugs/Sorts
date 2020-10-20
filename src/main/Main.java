package main;

import main.sort.mutable.*;

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
            new CycleSort(),
            new PigeonholeSort(),
            new CombSort(),
            new InsertionSortIterative(),
            new SelectionSort(),
            new PancakeSort(),
            new HeapSort(),
            new MergeSortRecursive(),
            new QuickSortRecursive(),
            new QuickSortIterative(),
            new QuickSortDualPivot(),
            new RadixSort(),
        }) {
            int[] arr = new int[array.length];
            System.arraycopy(array, 0, arr, 0, arr.length);
            measureTime(sort, arr);
        }
    }

    private static void measureTime(SortAlgorithm algorithm, int[] array) {
        long time = System.nanoTime();
        algorithm.sort(array);
        System.out.println(algorithm + ": " + (System.nanoTime() - time) / 1_000_000.0 + "ms");
    }
}
