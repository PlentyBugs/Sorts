package main.sort.immutable;

import main.sort.mutable.SortAlgorithm;

public abstract class SortAlgorithmImmutable implements SortAlgorithm {

    @Override
    public int[] sort(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return new int[0];
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return getSort().sort(newArray);
    }

    protected abstract SortAlgorithm getSort();
}
