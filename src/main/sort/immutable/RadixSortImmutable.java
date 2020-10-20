package main.sort.immutable;

import main.sort.mutable.RadixSort;

public class RadixSortImmutable extends SortAlgorithmImmutable {
    private final RadixSort sort;

    public RadixSortImmutable() {
        sort = new RadixSort();
    }

    @Override
    protected RadixSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Radix Sort Immutable";
    }
}
