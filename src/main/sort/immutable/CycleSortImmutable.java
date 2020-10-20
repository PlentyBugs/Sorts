package main.sort.immutable;

import main.sort.mutable.CycleSort;

public class CycleSortImmutable extends SortAlgorithmImmutable {
    private final CycleSort sort;

    public CycleSortImmutable() {
        sort = new CycleSort();
    }

    @Override
    protected CycleSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Cycle Sort Immutable";
    }
}
