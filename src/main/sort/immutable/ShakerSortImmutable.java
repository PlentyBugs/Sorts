package main.sort.immutable;

import main.sort.mutable.ShakerSort;

public class ShakerSortImmutable extends SortAlgorithmImmutable {
    private final ShakerSort sort;

    public ShakerSortImmutable() {
        sort = new ShakerSort();
    }

    @Override
    protected ShakerSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Shaker Sort Immutable";
    }
}
