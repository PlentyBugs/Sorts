package main.sort.mutable;

@FunctionalInterface
public interface SortAlgorithm {
    int[] sort(int[] array);

    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
