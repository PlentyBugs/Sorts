package main.sort.immutable;

public abstract class QuickSortImmutable extends SortAlgorithmImmutable {

    protected int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int partitionIndex = left;

        for (int i = left; i < right; i++)
            if (array[i] <= pivot)
                swap(array, i, partitionIndex++);

        swap(array, partitionIndex, right);

        return partitionIndex;
    }
}
