package main.sort.immutable;

import main.sort.mutable.PancakeSort;

public class PancakeSortImmutable extends SortAlgorithmImmutable {
    private final PancakeSort sort;

    public PancakeSortImmutable() {
        sort = new PancakeSort();
    }

    @Override
    protected PancakeSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Pancake Sort Immutable";
    }
}
