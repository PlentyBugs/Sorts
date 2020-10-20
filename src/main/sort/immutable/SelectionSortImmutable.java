package main.sort.immutable;

import main.sort.mutable.SelectionSort;

public class SelectionSortImmutable implements SortAlgorithmImmutable {
    public final SelectionSort sort;

    public SelectionSortImmutable() {
        sort = new SelectionSort();
    }

    @Override
    public SelectionSort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "Selection Sort Immutable";
    }
}
