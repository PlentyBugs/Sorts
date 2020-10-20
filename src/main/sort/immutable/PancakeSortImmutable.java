package main.sort.immutable;

import main.sort.mutable.PancakeSort;

public class PancakeSortImmutable implements SortAlgorithmImmutable {
    public final PancakeSort sort;

    public PancakeSortImmutable() {
        sort = new PancakeSort();
    }

    @Override
    public PancakeSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Pancake Sort Immutable";
    }
}
