package main.sort.immutable;

import main.sort.mutable.CycleSort;

public class CycleSortImmutable implements SortAlgorithmImmutable {
    public final CycleSort sort;

    public CycleSortImmutable() {
        sort = new CycleSort();
    }

    @Override
    public CycleSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Cycle Sort Immutable";
    }
}
