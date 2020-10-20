package main.sort.immutable;

import main.sort.mutable.SortAlgorithm;

public interface SortAlgorithmImmutable extends SortAlgorithm {

    @Override
    default int[] sort(int[] array) {
        if (array == null) return null;
        if (array.length == 0) return new int[0];
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return getSort().sort(newArray);
    }

    /**
     * The method is for internal use only
     * @return mutable SortAlgorithm that's used in immutable sort
     */
    SortAlgorithm getSort();
}
