package main.sort.immutable;

import main.sort.mutable.RadixSort;

public class RadixSortImmutable implements SortAlgorithmImmutable {
    public final RadixSort sort;

    public RadixSortImmutable() {
        sort = new RadixSort();
    }

    @Override
    public RadixSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Radix Sort Immutable";
    }
}
