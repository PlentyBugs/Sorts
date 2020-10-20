package main.sort.immutable;

import main.sort.mutable.CombSort;

public class CombSortImmutable implements SortAlgorithmImmutable {
    public final CombSort sort;

    public CombSortImmutable() {
        sort = new CombSort();
    }

    @Override
    public CombSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Comb Sort Immutable";
    }
}
