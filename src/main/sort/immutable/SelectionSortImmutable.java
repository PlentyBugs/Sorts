package main.sort.immutable;

import main.sort.mutable.SelectionSort;

public class SelectionSortImmutable extends SortAlgorithmImmutable {
    private final SelectionSort sort;

    public SelectionSortImmutable() {
        sort = new SelectionSort();
    }

    @Override
    protected SelectionSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Selection Sort Immutable";
    }
}
