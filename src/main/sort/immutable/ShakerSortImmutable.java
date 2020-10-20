package main.sort.immutable;

import main.sort.mutable.ShakerSort;

public class ShakerSortImmutable implements SortAlgorithmImmutable {
    public final ShakerSort sort;

    public ShakerSortImmutable() {
        sort = new ShakerSort();
    }

    @Override
    public ShakerSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Shaker Sort Immutable";
    }
}
