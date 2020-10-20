package main.sort.immutable;

import main.sort.mutable.CombSort;

public class CombSortImmutable extends SortAlgorithmImmutable {
    private final CombSort sort;

    public CombSortImmutable() {
        sort = new CombSort();
    }

    @Override
    protected CombSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Comb Sort Immutable";
    }
}
